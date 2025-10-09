package com.ratemyproperty.app.service;

import com.ratemyproperty.app.model.user.User;
import com.ratemyproperty.app.model.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(@Autowired UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String email,String name, String password) {
        User user = new User(email,name,password);
        userRepository.save(user);
        return user;
    }

    public String getUsersEmail(Long userId) {
        User user = userRepository.findById(userId).orElse(null);
        if(user == null){
            throw new Error("User not found");
        }
        return user.getEmail();
    }

}
