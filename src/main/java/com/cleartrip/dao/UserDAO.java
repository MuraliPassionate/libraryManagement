package com.cleartrip.dao;

import com.cleartrip.model.User;

public interface UserDAO {

    public void saveUser(User user);

    public User getUser(String userId);
}
