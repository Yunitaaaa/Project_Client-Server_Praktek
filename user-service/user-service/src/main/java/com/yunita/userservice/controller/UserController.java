/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yunita.userservice.controller;

import com.yunita.userservice.dto.User;
import com.yunita.userservice.service.UserService;
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 *
 * @author Administrator
 */
@RestController
public class UserController {
   private UserService userService;
    @Autowired
    private UserService userservice;
    
    @GetMapping ("/user")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    
    @GetMapping("/user/[id]")
    public User getUser(@PathVariable String id){
        return userService.getUser(id);
    }
    
    @GetMapping ("/user")
    public ResponseEntity<Object> addUser (@RequestBody User user){
        userService.addUser(user);
        URI path = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(user.getId())
                .toUri();
       return ResponseEntity.created(path).build();
    }
    
    @PutMapping("/user")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
    
    @DeleteMapping("/user/{id}")
    public User deleteUser (@PathVariable String id){
        return userService.deleteUser(id);
    }
}