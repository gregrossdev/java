package com.gregrossdev;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class c00ExpressionsTest {

    c00Expressions expressions = new c00Expressions();

    @Test
    void sumDouble() {
        assertEquals("Input: sumDouble(1, 2)", 3, expressions.sumDouble(1, 2));
        assertEquals("Input: sumDouble(3, 2)", 5, expressions.sumDouble(3, 2));
        assertEquals("Input: sumDouble(2, 2)", 8, expressions.sumDouble(2, 2));
    }
}