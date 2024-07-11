package repository;

import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository {



    User findByUsername(String username);

    User findById(long id);
    User createUser(User user);
    void deleteUserbyUsername(String username);

}
