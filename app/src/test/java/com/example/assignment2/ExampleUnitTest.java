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

    @Test
    public void is_not_password() {
        assertEquals(v.validate("hello"),1);
    }

    @Test
    public void is_long() {
        assertEquals(v.validate("password"),1);
    }

    @Test
    public void all_tests(){
        assertEquals(v.validate("arithmetic"),2);
    }
}