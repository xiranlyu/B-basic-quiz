package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private Long age;
    private String avatar;
    private String description;

    public User (String name, Long age, String avatar, String description) {
        this.name = name;
        this.age = age;
        this.avatar = avatar;
        this.description = description;
    }
}
