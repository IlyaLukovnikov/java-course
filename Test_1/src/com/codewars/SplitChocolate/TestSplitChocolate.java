package com.codewars.SplitChocolate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSplitChocolate {
    @Test
    public void myTests() {
        assertEquals(Chocolate.breakChocolate(5, 5) , 24);
        assertEquals(Chocolate.breakChocolate(1, 1) , 0);
    }
}
