package myCompany.taskManager.userService.model;

import jakarta.persistence.*;



@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // getters and setters
}
