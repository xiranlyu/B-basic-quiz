package com.example.demo.service;

import com.example.demo.exception.IdNotFoundException;
import com.example.demo.model.Education;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TODO GTB-工程实践: - 太多的 userMap.size() + 1，且不建议用 map.size() 来生成 userId

@Service
public class UserService {

    //TODO GTB-工程实践: - UserService.java:18 下面这些 map 或者 list 通常会被提取到 Repository 中去。这不属于 UserService 的职责。
    private Map<Long, User> userMap = new HashMap<>();
    private Map<Long, List<Education>> eduMap = new HashMap<>();
    long id = userMap.size() + 1;
    List<Education> eduList = new ArrayList<>();

    public UserService() {

    }

    public User getUserById(Long id) {
        return userMap.get(id);
    }

    public Long createUser(User user) {
        user.setId((long)(userMap.size() + 1));
        userMap.put((long) (userMap.size() + 1), user);
        return (long) userMap.size();
    }

    public void createEdu(Education education, Long id) {
        //TODO GTB-工程实践: - 可以用 return early pattern 改进这里的代码。
        if (userMap.containsKey(id)) {
            education.setId(this.id);
            eduList.add(education);
            eduMap.put(this.id, eduList);
        } else {
            throw new IdNotFoundException("Invalid ID!");
        }

    }

    public List<Education> getEduById(Long id) {
        //TODO GTB-知识点: - 这里可以使用 Optional API
        if (userMap.containsKey(id)) {
            return eduMap.get(id);
        } else {
            throw new IdNotFoundException("Invalid ID!");
        }
    }
}
