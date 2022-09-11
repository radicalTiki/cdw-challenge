package com.example.challenge;

import lombok.Data;

@Data
public class User {
    long id;
    String first_name;
    String last_name;
    String email;
    String gender;
    String ip_address;

    public User(){}
}
