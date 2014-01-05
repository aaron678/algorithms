package com.study.algorithms.factorial;
//calc using interative and recursive method
//http://www.java-examples.com/java-factorial-example
//http://www.programmerinterview.com/index.php/general-miscellaneous/java-method-calculate-factorial

public class CalcFactorial {
	
	int factorialIter(int n){
		int results = 1;
		for (int i=n; i>0; --i ){
			results = results * i;
			
		}
		return results;
	}
	
	int factorialRecurs(int n){
		if (n == 1)
			return n;
		return (this.factorialRecurs(n-1) * n);
	}
	
	public static void main (String[] args){
		System.out.println("3! is " + new CalcFactorial().factorialIter(3));
		System.out.println("5! is " + new CalcFactorial().factorialIter(5));
		
		System.out.println("3! is " + new CalcFactorial().factorialRecurs(3));
		System.out.println("5! is " + new CalcFactorial().factorialRecurs(5));
	}

}
