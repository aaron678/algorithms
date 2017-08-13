package com.study.algorithms.arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FirstNonRepeat {
	
	Character firstNotRepeatingCharcacter(String s) {
		Set<Character> firstNonRepeat = new LinkedHashSet<Character>();
		Set<Character> iWuzAlreadyRemoved = new HashSet<Character>();
		
		for (int i =0; i<s.length(); i++ ){
			Character c = new Character(s.charAt(i));
			if(firstNonRepeat.contains(c)){
				firstNonRepeat.remove(c);
				iWuzAlreadyRemoved.add(c);
			} else if(!iWuzAlreadyRemoved.contains(c)){
				firstNonRepeat.add(c);
			}
		}
		if (firstNonRepeat.size() == 0){
			return '_';
		}
         return firstNonRepeat.iterator().next();
	}

	public static void main(String[] args) {
		String data = "cccdadeafe";
		System.out.println(new FirstNonRepeat().firstNotRepeatingCharcacter(data));

	}

}
