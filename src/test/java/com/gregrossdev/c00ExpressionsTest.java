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

    @Test
    void dateFashion() {
        assertEquals("Input: dateFashion(5, 10)", 2, expressions.dateFashion(5, 10));
        assertEquals("Input: dateFashion(5, 2)", 0, expressions.dateFashion(5, 2));
        assertEquals("Input: dateFashion(5, 5)", 1, expressions.dateFashion(5, 5));
    }

    @Test
    void sortaSum() {
        assertEquals("Input: sortaSum(3, 4)", 7, expressions.sortaSum(3, 4));
        assertEquals("Input: sortaSum(9, 4)", 20, expressions.sortaSum(9, 4));
        assertEquals("Input: sortaSum(10, 11)", 21, expressions.sortaSum(10, 11));
    }

    @Test
    void teenSum() {
        assertEquals("Input: teenSum(3, 4)", 7, expressions.teenSum(3, 4));
        assertEquals("Input: teenSum(10, 13)", 19, expressions.teenSum(10, 13));
        assertEquals("Input: teenSum(13, 2)", 19, expressions.teenSum(13, 2));
    }

    @Test
    void teaParty() {
        assertEquals("Input: teaParty(6, 8)", 1, expressions.teaParty(6, 8));
        assertEquals("Input: teaParty(3, 8)", 0, expressions.teaParty(3, 8));
        assertEquals("Input: teaParty(20, 6)", 2, expressions.teaParty(20, 6));
    }

    @Test
    void loneSum() {
        assertEquals("Input: loneSum(1, 2, 3)", 6, expressions.loneSum(1, 2, 3));
        assertEquals("Input: loneSum(3, 2, 3)", 2, expressions.loneSum(3, 2, 3));
        assertEquals("Input: loneSum(3, 3, 3)", 0, expressions.loneSum(3, 3, 3));
    }
}