package com.example.challenge;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    private List<User> userList = new ArrayList<>();

    @PostMapping("/User")
    public ResponseEntity serializeUser(@RequestBody List<User> users) {
        userList.addAll(users);
        return ResponseEntity.status(HttpStatus.CREATED).body("Successfully posted Users");
    }

    @GetMapping("/User")
    public ResponseEntity<List<User>> deserializeUser() {
        return ResponseEntity.ok(userList);
    }
}
