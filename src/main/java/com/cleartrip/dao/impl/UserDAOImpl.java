package com.cleartrip.dao.impl;

import com.cleartrip.dao.UserDAO;
import com.cleartrip.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserDAOImpl implements UserDAO {

    private Map<String,User> users=new HashMap<String, User>();

    public void saveUser(User user) {
        users.put(user.getUserId(),user);

    }

    public User getUser(String userId){
        return users.get(userId);
    }

}
