package myCompany.taskManager.userService.repository;

import myCompany.taskManager.userService.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
