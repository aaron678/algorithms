package com.study.algorithms.stringNumberConv;

class AtoI {

    static int charToInt(String str){
        int res = 0;
        int i = 0;

        while (str.length() > i ){

            if (res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 &&
                    (str.charAt(i) - '0' > Integer.MAX_VALUE%10))
            ){
                return Integer.MAX_VALUE;
            }
            res = res * 10 + (str.charAt(i) - '0');
            i++;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(charToInt("2147483650"));
    }
}
