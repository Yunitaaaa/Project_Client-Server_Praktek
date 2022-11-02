/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.yunita.userservice.service;

import com.yunita.userservice.dto.User;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface UserService {
    public List<User> getAllUser();
    
    public User getUser(String id);
    
    public void addUser(User user);
    
    public User updateUser(User user);
    
    public User deleteUser(String id);

    public List<User> getAllUsers();
} 