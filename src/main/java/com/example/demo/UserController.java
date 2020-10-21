package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public Long createUser(@RequestBody @Valid User user) {
        return userService.createUser(user);
    }

    @RequestMapping(value = "/users/{id}/educations", method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public void addEdu(@RequestBody @Valid Education education, @PathVariable Long id) {
        userService.createEdu(education, id);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public User getUserById(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/users/{id}/educations", method = RequestMethod.GET)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<Education> getEduById(@PathVariable("id") Long id) {
        return userService.getEduById(id);
    }
}
