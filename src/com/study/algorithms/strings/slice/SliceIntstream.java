package com.study.algorithms.strings.slice;

public class SliceIntstream {
//TODO refactor code into functions

        public static void main(String[] args) {
            String str = "djbfkgr";

            System.out.println("sliceForward");

            for (int i=0; i < str.length(); i++) {
                String sliceForward = str.substring(i, i+1);
                System.out.println(sliceForward);
            }

            System.out.println("sliceRev");

            for (int i=str.length()-1; i >= 0; i--){
                String sliceRev = str.substring(i, i+1);
                System.out.println(sliceRev);
            }

            System.out.println("sliceRev2");

            for (int i=0; i < str.length(); i++) {
                String sliceRev2 = str.substring(str.length()-i-1, str.length()-i);
                System.out.println(sliceRev2);
            }

            System.out.println("sliceRevGrowStr");

            for (int i=0; i < str.length(); i++) {
                String sliceRevGrowStr = str.substring(str.length()-i-1);
                System.out.println(sliceRevGrowStr);
            }

            System.out.println("IntStream for each");

            str.chars().forEach(System.out::println);
            str.chars().forEach(c -> System.out.println((char)c));
        }
}
