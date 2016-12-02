package springMVCfirstApp.services.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springMVCfirstApp.Model.User;
import springMVCfirstApp.repository.UserRepository;
import springMVCfirstApp.services.api.UserService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by diran on 26.11.2016.
 */
@Component
public class UserServiceImpl implements UserService
{
    //@PersistenceContext
    //private EntityManagerFactory entityManagerFactory;

  /*  @PersistenceContext
    private EntityManager entityManager;*/

    @Autowired
    UserRepository userRepository;
    @Transactional
    public void saveUser(User user)
    {


        //List<User> users = userRepository.findUserByNameLike("Popov");

       /* List<User> users = entityManager.createQuery("Select u from User u where u.name = :name and u.password = :pass", User.class)
                .setParameter("name",user.getName()).setParameter("pass","Test1").getResultList();*/
       // List<User> users1 = userRepository.findByIdAndPasswordLike(4, "%dor");
       // entityManager.persist(user);
        userRepository.save(user);
       /* for(User u : allUsers)
        {
            System.out.println(u.getName().toString());
        }*/
       // users1.get(0).setPassword("Test1");
       // userRepository.save(users1.get(0));
    }

    public List<User> getAllUsers(){

        List<User> allUsers = (List<User>)userRepository.findAll();
        return  allUsers;
    }

    public User findUserPass(String name)
    {
        return null;
    }
    public UserServiceImpl() {
        //this.sessionFactory = sessionFactory;
    }
}
