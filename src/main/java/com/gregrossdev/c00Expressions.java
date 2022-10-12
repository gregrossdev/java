package com.gregrossdev;

public class c00Expressions {

//  TODO: NUMBERS

    /*
     * sumDouble(1, 2) → 3
     * sumDouble(3, 2) → 5
     * sumDouble(2, 2) → 8
     *
     * @param a int value
     * @param b int value
     * @return if params are equal double the sum
     *         else just sum
     */

    public static int sumDouble(int a, int b) {
        int sum = a + b;
        if(a == b)
            return sum * 2;
        else
            return sum;
    }

    public static void main(String[] args) {
        // testing playground
        System.out.println(sumDouble(1, 2));
        System.out.println(sumDouble(3, 2));
        System.out.println(sumDouble(2, 2));
    }
}
