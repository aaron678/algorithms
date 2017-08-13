package com.study.algorithms.BFtree.noDS;

//Recursive Java program for level order traversal of Binary Tree

/* Class containing left and right child of current 
node and key value*/
class Node
{
 Integer  data;
 Node left, right;
 public Node(int item)
 {
     data = item;
     left = right = null;
 }
}
