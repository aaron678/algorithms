package com.study.algorithms.arrays;

public class CalcArrayMedian {
        float  getArrayMedian (int[] ray ){
            if (ray.length % 2 == 1){
                return ray[ray.length / 2];
            }else{
                return (float)(ray[ray.length / 2 -1] + ray[(ray.length / 2)]) / 2;
            }
        }
        public static void main(String[] args) {
            int[] array1 = {1,5,6,13};


            System.out.println(new CalcArrayMedian().getArrayMedian(array1));
        }
}
