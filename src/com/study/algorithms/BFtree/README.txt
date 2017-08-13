http://www.geeksforgeeks.org/level-order-tree-traversal/

I started with the above algorithm that does breadth first traversal of a binary tree. There are some things about the original algorithm I didn’t like. It makes several passes through the tree, one for each level and another pass to calculate the height of the tree.

I’d like to do this operation in one pass, but you can’t without a data structure to gather the node data and the level it was found on. Once the data structure (a List of Lists) was populated after a pass through the tree, the algorithm reads out the results, starting at the first level.
