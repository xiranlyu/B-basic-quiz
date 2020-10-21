package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class UserService {

    private Map<Long, User> userMap = new HashMap<>();
    private Map<Long, List<Education>> eduMap = new HashMap<>();

    public UserService() {
        long id = userMap.size() + 1;
        List<Education> eduList = new ArrayList<>();
        eduList.add(new Education(id, (long) 2005, "Secondary school specializing in artistic", "Eos, explicabo, nam, tenetur et ab eius deserunt aspernatur ipsum ducimus quibusdam quis voluptatibus."));
        eduList.add(new Education(id, (long) 2009, "First level graduation in Graphic Design", "Aspernatur, mollitia, quos maxime eius suscipit sed beatae ducimus quaerat quibusdam perferendis? Iusto, quibusdam asperiores unde repellat."));

        userMap.put(id, new User(id, "KAMIL", (long) 24, "https://inews.gtimg.com/newsapp_match/0/3581582328/0", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Repellendus, non, dolorem, cumque distinctio magni quam expedita velit laborum sunt amet facere tempora ut fuga aliquam ad asperiores voluptatem dolorum! Quasi."));
        eduMap.put(id, eduList);
    }

    public User getUserById(Long id) {
        return userMap.get(id);
    }

    public List<Education> getEduById(Long id) {
        return eduMap.get(id);
    }
}
