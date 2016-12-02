package springMVCfirstApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import springMVCfirstApp.Model.User;

import java.util.List;

/**
 * Created by diran on 30.11.2016.
 */
public interface UserRepository extends CrudRepository<User,Integer>
{
    List<User> findUserByNameLike(String name);
    List<User> findByIdAndPasswordLike(Integer id, String pas);

}
