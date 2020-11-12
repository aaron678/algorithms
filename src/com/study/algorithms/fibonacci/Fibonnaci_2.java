package com.study.algorithms.fibonacci;

import java.math.BigInteger;

class Fibonacci_2 {
    //https://www.mathsisfun.com/numbers/fibonacci-sequence.html

    static BigInteger fib(int n){
        if (n <= 1) {
            return BigInteger.valueOf(n);
        }

        BigInteger head = BigInteger.valueOf(0), next = BigInteger.valueOf(1), sum = null;

        for (int i=2; i <= n; i++){
            sum = head.add(next);
            head = next;
            next = sum;

        }
        return sum;
    }

    static BigInteger fibNTR(int n){
        if (n <= 1) {
            return BigInteger.valueOf(n);
        }
        return fibNTR(n-1).add(fibNTR(n-2));
    }

    static BigInteger fibTR(int n, BigInteger a, BigInteger b){
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        return fibTR(n-1, b, a.add(b));
    }

    public static void main(String[] args) {
        System.out.println(fibTR(99, BigInteger.valueOf(0), BigInteger.valueOf(1)));
    }
}