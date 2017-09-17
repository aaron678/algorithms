package com.study.algorothms.hashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Dishes {
	String[][] groupingDishes(String[][] dishes) {
		TreeMap<String,List<String>> tm = new TreeMap<String,List<String>>();
		
		for (int i=0; i<dishes.length; i++){
			for (int j=1; j<dishes[i].length; j++){	
				if (tm.containsKey(dishes[i][j])){
					List<String> strList = (List<String>) tm.get(dishes[i][j]);
					strList.add(dishes[i][0]);
					tm.put(dishes[i][j], strList);
				}else {
					List<String> strList = new ArrayList<String>(1);
							strList.add(dishes[i][0]);
					tm.put(dishes[i][j],strList);
				}
			}
		}
		
		int size = 1;
		for (Map.Entry<String,List<String>> entry : tm.entrySet()){
			if (entry.getValue().size()>=2){
				Collections.sort(entry.getValue());
				size++;
			}
		}
		
		String [][] results = new String[size][];
		 
		int i=0;
		for (Map.Entry<String,List<String>> entry : tm.entrySet()){
			if (entry.getValue().size() >= 2){
				List<String> l = (List<String>)entry.getValue();
				l.add(0,entry.getKey());
				String[] s = new String[l.size()];
			results[i] =  l.toArray(s);
			i++;
			}
		}
		
       return results;
	}
	
	public static void main(String[] args) {

	String[][] dishesArray = {{"Salad", "Tomato", "Cucumber", "Salad", "Sauce"},
			{"Pizza", "Tomato", "Sausage", "Sauce", "Dough"},
			{"Quesadilla", "Chicken", "Cheese", "Sauce"},
			{"Sandwich", "Salad", "Bread", "Tomato", "Cheese"}};
	
    Dishes d = new Dishes();
    String[][] results = d.groupingDishes(dishesArray);
	}
}
