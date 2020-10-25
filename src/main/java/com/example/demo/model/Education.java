package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long year;
    @Size(min = 1, max = 256, message = "Title cannot be empty or longer than 256 bytes.")
    private String title;
    @Size(min = 1, max = 4096, message = "Description cannot be empty or longer than 4096 bytes.")
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
}
