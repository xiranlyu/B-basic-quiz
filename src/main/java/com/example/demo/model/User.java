package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;

    @Size(min = 1, max = 128, message = "Username is too short or too long.")
    private String name;
    @Min(value = 16, message = "Age should not be less than 16.")
    private Long age;
    @Size(min = 8, max = 512, message = "Address is too short or too long.")
    private String avatar;
    @Size(max = 1024, message = "Description is too long.")
    private String description;

    public User (String name, Long age, String avatar, String description) {
        this.name = name;
        this.age = age;
        this.avatar = avatar;
        this.description = description;
    }
}
