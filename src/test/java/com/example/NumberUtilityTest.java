package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilityTest {

    NumberUtility utility = new NumberUtility();

    @Test
    public void testEven() {
        assertTrue(utility.isEven(10));
        assertTrue(utility.isEven(0));
        assertTrue(utility.isEven(-4));
        assertFalse(utility.isEven(7));
    }

    @Test
    public void testOdd() {
        assertTrue(utility.isOdd(7));
        assertTrue(utility.isOdd(-3));
        assertFalse(utility.isOdd(10));
        assertFalse(utility.isOdd(0));
    }
}