package com.example.spring_boot.service;

import com.example.spring_boot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUser(int id);
    void addUser(User user);
    void update(User updatedUser);
    void delete(int id);
}