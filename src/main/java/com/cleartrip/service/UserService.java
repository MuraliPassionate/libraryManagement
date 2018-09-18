package com.cleartrip.service;

import com.cleartrip.model.User;

public interface UserService {


      public void saveUser(User user);

      public User getUser(String userId);

}
