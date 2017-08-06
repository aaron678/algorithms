package com.study.algorithms.BFtree.wDS;

//Recursive Java program for level order traversal of Binary Tree

/* Class containing left and right child of current 
node and key value*/
class Node
{
 int data;
 Node left, right;
 public Node(int item)
 {
     data = item;
     left = right = null;
 }
}
