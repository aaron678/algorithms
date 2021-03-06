package com.study.algorithms.arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FirstNonRepeat  {
	
	Character firstNotRepeatingCharacter(String s) {
		Set<Character> firstNonRepeat = new LinkedHashSet<>();
		Set<Character> iWuzAlreadyRemoved = new HashSet<>();
		
		for (int i =0; i<s.length(); i++ ){
			// unnecessary boxing Character c  = Character.valueOf(s.charAt(i));
			Character c  = s.charAt(i);
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
		System.out.println(new FirstNonRepeat().firstNotRepeatingCharacter(data));

	}

}
