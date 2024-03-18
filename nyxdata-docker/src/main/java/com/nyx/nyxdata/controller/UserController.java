package com.nyx.nyxdata.controller;


import com.nyx.nyxdata.entity.User;
import com.nyx.nyxdata.repository.UserRepository;
import com.nyx.nyxdata.service.UserService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        return userService.getUser(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable("id") Integer id, @RequestBody User user) {

            return userService.updateUser(id, user);
    }

    @PatchMapping("/{id}")
    public User updatePatchUser(@PathVariable("id") Integer id, @RequestBody User user) {

            return userService.updatePatchUser(id, user);

    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void deleteUser(@PathVariable("id") Integer id) {
        userService.deleteUser(id);
    }
}