/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.yunita.userservice.service;

import com.yunita.userservice.dto.User;
import java.util.List;

/**
 *
 * @author acer
 */
public interface UserService {

  
    public User getUser(String id);

    public List<User> getAllUsers();

    public User deleteUser(String id);

    public User updateUser(User user);

    public void addUser(User user);



}