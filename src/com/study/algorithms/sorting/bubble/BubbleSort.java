package com.study.algorithms.sorting.bubble;

public class BubbleSort {

	int[] sort (int ... aRay){
		int numSwitches = 0;
		do{
			numSwitches = 0;
			for (int i =0; i<aRay.length-1; i++){
				//if i greater than i+1 then switch
				if (aRay[i] > aRay[i+1]){
					numSwitches++;
					int temp = aRay[i];
					aRay[i] = aRay[i+1];
					aRay[i+1] = temp;
				}
			}
		}while (numSwitches >0);
		return aRay;
	}

	public static void main(String[] args) {
		int[] aRay = {3,5,2,4};
		int[] newRay = new BubbleSort().sort(aRay);
		for (int i =0; i<newRay.length; i++){
			System.out.print(newRay[i]);
		}
//		System.out.println();
//		int[] newRay2 = new BubbleSort().sort(newRay);
//		for (int i =0; i<newRay2.length; i++){
//			System.out.print(newRay2[i]);
//		}
	}

}
