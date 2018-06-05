package com.example.assignment2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Validator {
    // validate method
    public int validate(String password) {

        //variables
        int x = 0;

        //password contains a special character
        Pattern p1 = Pattern.compile("[!@#$%&*()_+=|<>?{}\\\\[\\\\]~-]");
        Matcher m1 = p1.matcher(password);
        boolean b1 = m1.find();
        if(b1){
            x++;
        }

        //password contains a number
        Pattern p2 = Pattern.compile("[0-9]");
        Matcher m2 = p2.matcher(password);
        boolean b2 = m2.find();
        if(b2){
            x++;
        }

        //has uppercase and lower case
        boolean hasUpp = !password.equals(password.toLowerCase());
        boolean hasLow = !password.equals(password.toUpperCase());
        if(hasUpp && hasLow){
            x++;
        }

        //length is over 8
        if(password.length() >= 8 ) {
            x++;
        }

        //password not equal to "password"
        if(!(password.equals("password"))) {
            x++;
        }


        return x;
    }
}
