package com.driver.services;

import com.driver.models.*;
import com.driver.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository3;

    @Autowired
    BlogService blogService3;

    public void createUser(User user){
        userRepository3.save(user);
    }

    public void deleteUser(int userId){
        userRepository3.deleteById(userId);

    }

    public void updateUser(User user){
        User newUser = userRepository3.findById(user.getId());
        newUser.setUserName(user.getUserName());
        newUser.setLastName(user.getLastName());
        newUser.setFirstName(user.getFirstName());
        newUser.setPassword(user.getPassword());
        userRepository3.save(newUser);
    }

    public User findUserByUsername(String username){
        return userRepository3.findByUsername(username);
    }
}
