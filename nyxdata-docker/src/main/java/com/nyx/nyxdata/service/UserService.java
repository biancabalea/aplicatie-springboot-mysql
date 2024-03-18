package com.nyx.nyxdata.service;

import com.nyx.nyxdata.entity.User;
import com.nyx.nyxdata.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUser(@PathVariable("id") Integer id) {
        return userRepository.findById(id).get();
    }

    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    public User updateUser(@PathVariable("id") Integer id, @RequestBody User user) {
        User existingUser = userRepository.findById(id).get();
        if (existingUser != null) {
            existingUser.setEmail(user.getEmail());
            existingUser.setPhone(user.getPhone());
            existingUser.setPassword(user.getPassword());
            // Add other fields as needed
            return userRepository.save(existingUser);
        }
        return null; // Handle not found scenario
    }

    public User updatePatchUser(@PathVariable("id") Integer id, @RequestBody User user) {
        User existingUser = userRepository.findById(id).get();
        if (existingUser != null) {
            if (user.getEmail() != null) {
                existingUser.setEmail(user.getEmail());
            }
            if (user.getPhone() != null) {
                existingUser.setPhone(user.getPhone());
            }
            if (user.getPassword() != null) {
                existingUser.setPassword(user.getPassword());
            }
            // Add other fields as needed
            return userRepository.save(existingUser);
        }
        return null; // Handle not found scenario
    }

    public void deleteUser(@PathVariable("id") Integer id) {
        userRepository.deleteById(id);
    }
}
