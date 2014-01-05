package com.study.algorithms.prefix;

public class PrefixSums {
//time complexity O(n)- linear time
	int prefixSum1(int n){
		int total=0;
		for (int i=1; i<=n; ++i){
			total = total+i;
		}
		return total;
	}

	//time complexity O(1)- constant time
	int prefixSum2(int n){
		return (n*n+n)/2;
	}
	
	//sums all prefix sums from 1 to n
	//time complexity O(n)- linear time
	int prefixScan1(int n){
		int total=0;
		int prevTotal = 0;
		for (int i=1; i<=n; ++i){
			prevTotal = prevTotal+i;
			total +=prevTotal;
		}
		return total;
	}
	
	//sums a segment of prefix sums
	//time complexity O(n)- linear time
	int prefixSlice1(int begin, int end){
		int total=0;
		int prevTotal = 0;
		for (int i=1; i<=end; ++i){
			prevTotal = prevTotal+i;
			if (i>=begin && i<=end)
			total +=prevTotal;
		}
		return total;
	}
	
	
	//TODO O(1) version of slice
	
public static void main (String[] args){
//	System.out.println(new PrefixSums().prefixSum1(3));
	System.out.println(new PrefixSums().prefixSum2(2));
	System.out.println(new PrefixSums().prefixSum2(3));
//	System.out.println(new PrefixSums().prefixScan1(3));
	System.out.println(new PrefixSums().prefixSlice1(1,3));
}
}
