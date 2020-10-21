package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUserById(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/users/{id}/educations", method = RequestMethod.GET)
    @ResponseBody
    public List<Education> getEduById(@PathVariable("id") Long id) {
        return userService.getEduById(id);
    }
}
