package com.study.algorithms.reverse;

public class NumbersReverse2 {
        static int reverso (int i){
            int rev = 0;
            while (i > 0){
                rev = rev * 10 + i % 10;
                i = i / 10;
            }
            return rev;
        }
        public static void main(String[] args) {
            System.out.println(reverso(2134));
        }
}
