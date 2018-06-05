package com.example.assignment2;

public class Validator {
    // validate method
    public int validate(String password) {
        int x = 0;
        if(password.length() >= 8 ) {
            x++;
        }if(!(password.equals("password"))) {
            x++;
        }
        return x;
    }
}