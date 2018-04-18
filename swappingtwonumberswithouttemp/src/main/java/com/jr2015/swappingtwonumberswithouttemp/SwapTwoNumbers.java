package com.jr2015.swappingtwonumberswithouttemp;



public class SwapTwoNumbers {

    public static void processData() {

        // write your code here
        int a = 10;
        int b = 20;

        // Solution 1
        System.out.println("Solution 1: swap two numbers without " +
                "temp variable");

        System.out.printf("Solution 1: Before swap 'a': %d, 'b': %d %n", a, b);

        // Solution 1 - Using Addition and Subtraction
        // You can use + and - operator in Java to swap two integers
        // as shown below :
        a = a + b;
        b = a - b;   // actually (a + b) - (b), so now b is equal to a
        a = a - b;   // (a + b) -(a), now a is equal to b

        System.out.printf("Solution 1: After swap 'a': %d, 'b': %d %n", a, b);

        /////////////////////////////////////////////////////////

        // Solution 2
        System.out.println("Solution 2: swap two numbers without temp " +
                "variable using MIN_VALUE & MAX_VALUE");

        a = Integer.MIN_VALUE;
        b = Integer.MAX_VALUE;

        System.out.printf("Solution 2: Before swap 'a': %d, 'b': %d %n", a, b);

        a = a + b;
        b = a - b;   // actually (a + b) - (b), so now b is equal to a
        a = a - b;   // (a + b) -(a), now a is equal to b

        System.out.printf("Solution 2: After swap 'a': %d, 'b': %d %n", a, b);

        /////////////////////////////////////////////////////////

        // Solution 3

        // Another way to swap integers without using temp variable is
        // by using XOR bitwise operator
        // Known as XOR trick

        System.out.println("Solution 3: swap two numbers without temp " +
                "variable using XOR");

        a = 21;
        b = 47;

        System.out.printf("Solution 3: Before XOR swap 'a': %d, 'b': %d %n", a,
                b);

        a = a ^ b;
        b = a ^ b; // now b = a
        a = a ^ b; // now a = b

        System.out.printf("Solution 3: After XOR swap 'a': %d, 'b': %d " +
                        "%n", a,
                b);

    }
}