package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class UserService {

    private Map<Long, User> userMap = new HashMap<>();

    public UserService() {
        userMap.put((long) (userMap.size() + 1), new User((long) (userMap.size() + 1), "KAMIL", (long) 24, "https://inews.gtimg.com/newsapp_match/0/3581582328/0", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Repellendus, non, dolorem, cumque distinctio magni quam expedita velit laborum sunt amet facere tempora ut fuga aliquam ad asperiores voluptatem dolorum! Quasi."));
    }

    public User getUserById(Long id) {
        return userMap.get(id);
    }
}
