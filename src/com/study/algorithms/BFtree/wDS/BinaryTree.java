package com.study.algorithms.BFtree.wDS;

import java.util.ArrayList;
import java.util.List;

class BinaryTree
{
    // Root of the Binary Tree
    Node root;
 
    public BinaryTree()
    {
        root = null;
    }
 
    /* function to print level order traversal of tree*/
    void printLevelOrder()
    {
    	List<List> results = generateDS(root, 1, new ArrayList());
    	for (int level=0;  level<=results.size()-1; level++){
    		System.out.println("Printing level: " + level);
    		for (int el=0; el<=results.get(level).size()-1; el++)
    			System.out.print(results.get(level).get(el) + " ");
    		System.out.println();
    	}
    }
 
    /* Walks the tree and updates the data structure which holds the results*/
    List<List> generateDS(Node root, int level, List<List> results)
    {
    	
        if (root == null)
           return results;
        else
        {
        	if (results.size() < level){
        		results.add(new ArrayList());
        	}
            /* compute  height of each subtree */
        	results.get(level-1).add(root.data);
            generateDS(root.left, level+1, results);
            generateDS(root.right, level+1, results);
        }
        return results;
    }
 
    /* Driver program to test above functions */
    public static void main(String args[])
    {
       BinaryTree tree = new BinaryTree();
       tree.root= new Node(1);
       tree.root.left= new Node(2);
       tree.root.right= new Node(3);
       tree.root.left.left= new Node(4);
       tree.root.left.right= new Node(5);
        
       System.out.println("Level order traversal of binary tree is ");
       tree.printLevelOrder();
    }
}