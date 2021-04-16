package pl.coderslab.charity.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Data
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long quantity;
    @ManyToMany
    private List <Category> categories;
    @ManyToOne
    private Institution institution;
    @Column(nullable = false)
    private String street;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String zipCode;
    @Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate pickUpDate;
    @Column(nullable = false)
    private LocalTime pickUpTime;
    @Column(nullable = false)
    private String pickUpComment;


}
