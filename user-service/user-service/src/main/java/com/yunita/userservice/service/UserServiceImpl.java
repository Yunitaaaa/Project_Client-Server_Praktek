/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yunita.userservice.service;

import com.yunita.userservice.dto.User;
import com.yunita.userservice.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service
public abstract class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    private User User;
    
    @Override
    public List<User> getAllUsers(){
        return userRepository.getAllUsers();
    }
    
    @Override
    public User getUser(String id){
        return userRepository.getUser(id);
    }
    
    
    @Override
    public void addUser(User user) {
        userRepository.addUser(User);
    }
    
    @Override
    public User updateUser(User user){
        return userRepository.updateUser(user);
    }
    
    @Override
    public User deleteUser(String id){
        return userRepository.deleteUser(id);
    }
}