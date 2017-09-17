package com.study.algorothms.hashMap;

import static org.junit.Assert.*;

import org.junit.Test;

public class DishesTest {

	@Test
	public void test() {
		String[][] dishesArray = {{"Salad", "Tomato", "Cucumber", "Salad", "Sauce"},
				{"Pizza", "Tomato", "Sausage", "Sauce", "Dough"},
				{"Quesadilla", "Chicken", "Cheese", "Sauce"},
				{"Sandwich", "Salad", "Bread", "Tomato", "Cheese"}};
		
		String[][] answer = {{"Cheese", "Quesadilla", "Sandwich"},
				{"Salad", "Salad", "Sandwich"},
				{"Sauce", "Pizza", "Quesadilla", "Salad"},
				{"Tomato", "Pizza", "Salad", "Sandwich"}};
		
		String[][] result = new Dishes().groupingDishes(dishesArray);
		for(int i=0; i<result.length-1; i++){
		assertArrayEquals(answer[i], result[i]);
		}
	}

}
