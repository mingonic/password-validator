package com.example.assignment2;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;


@RunWith(AndroidJUnit4.class)
public class PasswordTests {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void Testing_Button() {

        onView(withId(R.id.button));

        //Should return a 0 thus no password entered
        onView(withId(R.id.Display)).check(matches(withText("Not Strong")));
    }

    @Test
    public void Testing_Weak_Password() {
        //Should return a 1 thus weak password
        onView(withId(R.id.editText)).perform(typeText("password"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.Display)).check(matches(withText("Weak")));
    }

    @Test
    public void Testing_Fair_Password() {
        //Should return a 2 thus fair strength password
        onView(withId(R.id.editText)).perform(typeText("h$"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.Display)).check(matches(withText("Fair")));
    }

    @Test
    public void Testing_Good_Password() {
        //Should return a 3 thus good strength password
        onView(withId(R.id.editText)).perform(typeText("h$"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.Display)).check(matches(withText("Good")));
    }

    @Test
    public void Testing_Strong_Password() {
        //Should return a 4 thus strong strength password
        onView(withId(R.id.editText)).perform(typeText("h$1"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.Display)).check(matches(withText("Strong")));
    }

    @Test
    public void Testing_Excellent_Password() {
        //Should return a 5 thus an excellent strength password (passes all rules)
        onView(withId(R.id.editText)).perform(typeText("He1!o"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.Display)).check(matches(withText("Excellent")));

    }
}
