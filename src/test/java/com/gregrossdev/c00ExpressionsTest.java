package com.gregrossdev;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class c00ExpressionsTest {

    c00Expressions expressions = new c00Expressions();

//  NUMBERS
    @Test
    void sumDouble() {
        assertEquals("Input: sumDouble(1, 2)", 3, expressions.sumDouble(1, 2));
        assertEquals("Input: sumDouble(3, 2)", 5, expressions.sumDouble(3, 2));
        assertEquals("Input: sumDouble(2, 2)", 8, expressions.sumDouble(2, 2));
    }

    @Test
    void diff21() {
        assertEquals("Input: diff21(19)", 2, expressions.diff21(19));
        assertEquals("Input: diff21(10)", 11, expressions.diff21(10));
        assertEquals("Input: diff21(21)", 0, expressions.diff21(21));
        assertEquals("Input: diff21(22)", 2, expressions.diff21(22));
        assertEquals("Input: diff21(-10)", 31, expressions.diff21(-10));
    }

    @Test
    void intMax() {
        assertEquals("Input: intMax(1, 2, 3)", 3, expressions.intMax(1, 2, 3));
        assertEquals("Input: intMax(1, 3, 2)", 3, expressions.intMax(1, 3, 2));
        assertEquals("Input: intMax(3, 2, 1)", 3, expressions.intMax(3, 2, 1));
    }

    @Test
    void max1020() {
        assertEquals("Input: max1020(11, 19)", 19, expressions.max1020(11, 19));
        assertEquals("Input: max1020(19, 11)", 19, expressions.max1020(19, 11));
        assertEquals("Input: max1020(11, 9)", 11, expressions.max1020(11, 9));
    }
}