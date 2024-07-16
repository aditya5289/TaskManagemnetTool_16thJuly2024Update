package myCompany.taskManager.userService.repository;

import myCompany.taskManager.userService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
