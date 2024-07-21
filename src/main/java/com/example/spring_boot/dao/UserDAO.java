package com.example.spring_boot.dao;

import com.example.spring_boot.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();
    User getUser(int id);
    void addUser(User user);
    void update(User updatedUser);
    void delete(int id);
}