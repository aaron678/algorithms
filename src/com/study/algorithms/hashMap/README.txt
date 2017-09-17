The algorithm was from code fights. The essence of the task is to create a hash map inverting the keys and values.

What is interesting about this code is a reminded on line 35 that in a 2D array you need not define the length of the second dimension when creating the array.

Also on line 43 there is an interesting code pattern for toArray(). toArray() returns Object[]. If you want some other type of array, you just can’t do a cast. However toArray() provides a facility for returning any array type you want. 

https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#toArray-T:A-

You have a list of dishes. Each dish is associated with a list of ingredients used to prepare it. You want to group the dishes by ingredients, so that for each ingredient you'll be able to find all the dishes that contain it (if there are at least 2 such dishes).

Return an array where each element is a list with the first element equal to the name of the ingredient and all of the other elements equal to the names of dishes that contain this ingredient. The dishes inside each list should be sorted lexicographically. The result array should be sorted lexicographically by the names of the ingredients in its elements.