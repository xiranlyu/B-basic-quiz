package com.example.demo.controller;

import com.example.demo.service.UserService;
import com.example.demo.model.Education;
import com.example.demo.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

//TODO GTB-知识点: - 用 @RestController 代替 @Controller + @ResponseBody
@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //TODO GTB-知识点: - 用 @PostMapping 代替 @RequestMapping(method = RequestMethod.POST)
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

    //TODO GTB-知识点: - 查询 user 的 API 怎么能用 POST？Copy 过来的忘改了？
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
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
