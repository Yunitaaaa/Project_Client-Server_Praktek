/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yunita.userservice.repository;

import com.yunita.userservice.dto.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrator
 */
@Repository
public class UserRepository {
    List<User> userList;

    public UserRepository() {
        List<User> userList = new ArrayList<>();
    }
    
    public List<User> getAllUsers(){
        return userList;
    }
    
    public User getUser(String id){
        Optional<User> first =  userList.stream()
                .filter(u -> u.grtId().equals(id))
                .findFirst();
        if(first.isPresent()){
            return first.get();
            
        }
        else{
            return new User();
        }
    }
    
    public void addUser(User user){
        userList.add(user);
    }
    
    public User updateUser (User user){
        for (User u1 : userList){
            if (u1.getId().equals(user.getId())){
                u1.getName (user.getName());
                u1.setAddress(user.getAddress());
                return u1;
            }
        }
        return new User();
    }
    
    public User deleteUser(String id){
        Optional<User> first = userList.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();
        if (first.isPresent()){
            User user = first.get();
            userList.remove(user);
            return user;
        }else{
            return new User();
        }
        
    }

    public List<User> getSllUser() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
