package pl.coderslab.charity.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true, length = 60)
    private String email;
    @Column(nullable = false, length = 60)
    private String password;
    private String firstName;
    private String lastName;
}
