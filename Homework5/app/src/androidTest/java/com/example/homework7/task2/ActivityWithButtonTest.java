package com.example.homework7.task2;

import androidx.test.rule.ActivityTestRule;

import com.example.homework5.R;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class ActivityWithButtonTest {
    @Rule
    public ActivityTestRule<ActivityWithButton> activityWithButtonActivityTestRule = new ActivityTestRule<>(ActivityWithButton.class);

    @Test
    public void onClick(){
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.text)).check(matches(withText("Hello!")));
    }
}
