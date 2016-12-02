package springMVCfirstApp.services.api;

import springMVCfirstApp.Model.User;

import java.util.List;

/**
 * Created by diran on 26.11.2016.
 */
public interface UserService {
    void saveUser(User user);

    List<User> getAllUsers();

    User findUserPass(String name);
}
