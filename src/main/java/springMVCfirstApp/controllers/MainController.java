package springMVCfirstApp.controllers;


import org.hibernate.annotations.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import springMVCfirstApp.Model.User;
import springMVCfirstApp.services.api.UserService;
import springMVCfirstApp.services.impl.UserServiceImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;


/**
 * Created by diran on 25.11.2016.
 */
@Controller
public class MainController {
    /*First method on start application*/
    /*Попадаем сюда на старте приложения (см. параметры аннотации и настройки пути после деплоя) */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {

        /*Class userClass = User.class;
        Annotation[] anntations = userClass.getDeclaredAnnotations();
        System.out.println(anntations.length);
        for(Annotation annotation : anntations) {
            System.out.println(annotation.toString());
        }
        try {
            Field[] fields = userClass.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field.getName());

                for (Annotation a : field.getAnnotations()) {
                    System.out.println(a.toString());
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }*/
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userJSP", new User());
       // System.out.println(modelAndView.getModel().toString());
        modelAndView.setViewName("index");
        return modelAndView;
    }

    /*как только на index.jsp подтвердится форма
    <spring:form method="post"  modelAttribute="userJSP" action="check-user">,
    то попадем вот сюда
     */
    @Autowired
    UserService userService;


    @RequestMapping(value = "/check-user", method = RequestMethod.POST)
    public ModelAndView checkUser(@ModelAttribute() User user) {
        ModelAndView modelAndView = new ModelAndView();

        //имя представления, куда нужно будет перейти
        modelAndView.setViewName("valid");

        //записываем в атрибут userJSP (используется на странице *.jsp объект user
       // modelAndView.addObject("userJSP", user);
        userService.saveUser(user);

        List<User> users = userService.getAllUsers();

        modelAndView.addObject("users", users);

        return modelAndView; //после уйдем на представление, указанное чуть выше, если оно будет найдено.
    }
    @RequestMapping(value = "/userPass", method = RequestMethod.GET)
    public ModelAndView showUserPass(@ModelAttribute(value = "user") User user)
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userPass");
       // List<User> users = userService.getAllUsers();

       /* user = userService.findUserPass(user.getName());
        modelAndView.addObject(user);*/
        return modelAndView;
    }
}
