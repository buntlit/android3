package com.example.homework7.task1;

import com.example.homework7.task1.unit.Addition;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AdditionTest {

    private Addition addition;

    @Before
    public void before() {
        addition = new Addition();
    }

    @Test
    public void additionTwoNumbers_whenSome_isCorrect(){
        int first = 5;
        int second = 3;
        int summary = addition.additionTwoNumbers(first, second);
        Assert.assertEquals(summary, 8);
    }

    @Test
    public void additionTwoNumbers_whenSome_isIncorrect(){
        int first = 5;
        int second = 3;
        int summary = addition.additionTwoNumbers(first, second);
        Assert.assertNotEquals(summary, 9);
    }
}
