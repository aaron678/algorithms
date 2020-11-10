package com.study.algorithms.primes;

// part of fb prep

class CheckPrime {
    static boolean checkPrime(int n){
        if (n==1)
            return false;
        if (n==2)
            return true;
        if (n%2==0)
            return false;

        boolean result = true;
        for (int i=3; i*i<n; i+=2){
            if (n % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(checkPrime(5));
    }
}
