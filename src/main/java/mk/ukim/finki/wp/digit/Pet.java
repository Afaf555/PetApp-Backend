package mk.ukim.finki.wp.digit;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

// Pet.java
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private String breed;
    private String age;
    private String color;
    private String description;
    private String contact;
    @Column(columnDefinition = "TEXT")
    private String image;
    private String status;
    private LocalDateTime createdAt;
    private String location;
    private String gender;
    private String date;
}