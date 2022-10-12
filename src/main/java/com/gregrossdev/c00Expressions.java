package com.gregrossdev;

public class c00Expressions {

//  TODO: NUMBERS

    /*
     * sumDouble(1, 2) → 3
     * sumDouble(3, 2) → 5
     * sumDouble(2, 2) → 8
     *
     * @param a
     * @param b
     * @return int
     *      if params are equal double the sum
     *      else sum
     */

    public static int sumDouble(int a, int b) {
        int sum = a + b;
        if(a == b)
            return sum * 2;
        else
            return sum;
    }

    /*
     * diff21(19) → 2
     * diff21(10) → 11
     * diff21(21) → 0
     * diff21(22) → 2
     * diff21(-10) → 31
     *
     * @param n
     * @return int
     *      if n is greater than 21 return double the difference between 21 and n
     *      else the difference between n and 21
     */
    public static int diff21(int n) {
        if (n > 21)
            return 2 * (n - 21);
        else
            return 21 - n;
    }

    public static void main(String[] args) {
        // testing playground
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
        System.out.println(diff21(22));
        System.out.println(diff21(-10));
    }
}
