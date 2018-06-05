package com.example.assignment2;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    static Validator v;
    @BeforeClass
    public static void test() {
        v = new Validator();
    }

    //checking to see that it is not the string "password"
    @Test
    public void is_not_password() {
        assertEquals(v.validate("hello"),1);
    }

    //Password contains a special character
    @Test
    public void is_Special() {
        String s = "H$ll0!!!";

        //assertEquals(v.validate(s),1);
    }

    //Password contains a number
    @Test
    public void is_a_number() {
        String s = "B3lltone";

        //assertEquals(v.validate(s),1);
    }

    //Password contains a uppercase and a lower case
    @Test
    public void is_UPPER_and_lower() {
        String s = "HaHaHaHaHaHaHa";

        //assertEquals(v.validate(s),1);
    }

    //Password is at least 8 characters long
    @Test
    public void is_long() {
        assertEquals(v.validate("password"),1);
    }

    //Password passes all tests
    @Test
    public void all_tests(){
        assertEquals(v.validate("arithmetic"),2);
    }
}