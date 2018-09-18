package com.cleartrip.service.impl;

import com.cleartrip.Util.SingletonUtil;
import com.cleartrip.dao.UserDAO;
import com.cleartrip.model.User;
import com.cleartrip.service.UserService;

public class UserServiceImpl implements UserService {


    UserDAO userDAO=SingletonUtil.getUserdao();

    public void saveUser(User user) {

        userDAO.saveUser(user);

    }

    public User getUser(String userId){
       return userDAO.getUser(userId);
    }

}
