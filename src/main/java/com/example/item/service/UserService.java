package com.example.item.service;

import com.example.item.entity.User;
import com.example.item.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User getUser(int uid){
        return userRepository.findById(uid).orElse(null);
    }
    public List getUser(String uname){
        return userRepository.findByName(uname);
    }
    public void addUser(User user) {
        userRepository.save(user);
    }
    public void updateUser(User user){
        userRepository.save(user);
    }
    public void deleteUser(int uid){
        userRepository.deleteById(uid);
    }
    public List<User> findbyName(String name,int id){
       return userRepository.deleteByNameAndId(id,name);
    }
}
