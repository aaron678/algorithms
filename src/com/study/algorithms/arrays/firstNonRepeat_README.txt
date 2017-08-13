This problem came from code fights.
“Write a solution that only iterates over the string once and uses O(1) additional memory.
Given a string s, find and return the first instance of a non-repeating character in it. If there is no such character, return '_'.

Discussion. 

This test is seems simple but it is interesting because the algorithm you create depends on the test cases you are writing for. Here it is critical to get the important edge cases before coding. The initial version of my solution did not have the iWuzAlreadyRemoved structure. Everything worked except when the number of duplicates was odd. When the duplicates were odd, that character kept getting added back into the non-duplicates list, so I needed another data structure to track characters that were previously removed from the non-duplicates setbut didn’t exist in that set any longer.

Initially I used an ArrayList which worked well enough since it preserved insertion order and had a contains() method. But looking at the source for ArrayList, the contains() method delegates to indexOf(object) which in turn, iterates through the entire array. A more efficient way is to use Set since it has a contains() method  which is backed by a HashMap which has a time complexity of O(1) for reads. The question is how do you preserve insertion order since you need to return the first non-duplicate? This can be done by using the LinkedHashSet class. It has the HashTable backed Set as well as doubly-linked nodes to preserve insertion order. Since I’m getting the head of the list, traversal is very efficient.