package com.study.algorithms.power;

public class CalcPower {
	//time complexity O(n)
	int calcPower1(int base, int power){
		int total = base;
		for (int i=2; i<=power; ++i){
			total = total*base;
			
		}
		
		return total;
		
	}
	
	//time complexity O(log n)
	int calcPowerRecurse(int base, int power){
		return calcPowerRecurse(base, power, power, base);
	}
	int calcPowerRecurse(int base, int power, int initialPower, int initialBase){
		if (power == 2)
			if (initialPower%2 == 0)
			return base*base;
			else
				return (base*base)*initialBase;
		
		return this.calcPowerRecurse(base*base,power/2, initialPower, initialBase);
	}
	
	//time complexity O(n)
	int calcPowerIterative(int base, int power){
		boolean isPowerOdd = false;
		int initialBase = base;
		if (power%2 == 1){
			power = power -1;
			isPowerOdd = true;
		}		
		while (power>2){
			base = base*base;
			power = power/2;	
		}
		if (isPowerOdd)
			return (base * base) * initialBase;
		else
			return base * base;
		
	}
	
	public static void main (String args[]){
		System.out.println(new CalcPower().calcPower1(3,5));
		System.out.println(new CalcPower().calcPowerRecurse(3,5));
		System.out.println(new CalcPower().calcPowerIterative(3,5));
//		System.out.println(new CalcPower().calcPower1(4,4));
//		System.out.println(new CalcPower().calcPower1(16,2));
	}
	

}
