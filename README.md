# 2-3-Trees
Implementation of 2-3 Trees

2-3 Trees is a data structure where all the data is stored at leaves. It provides basic functionality like insert, search, and delete. Since all the data is stored in leaf nodes, all the operations has worst case time complexity of O(log N).

## main.java && Data-set
main.java is a driver program for testing the tree. There are data files in the data-set folder which provides input to the driver program. Each data input file is accompanied with the output file.

The given implementation of the 2-3 trees has been thoroughly tested using different sets of data.

## TwoThreeTree.java
This file implements the data Structure. It has three nested class Node, TreeNode, and LeafNode.

  1.  Node class: This class is a dummy class and just acts as a parent class for TreeNode and LeafNode.
  2.  TreeNode class: This class defines the structure of a tree node. It extends Node class. It has three member variables - an array of keys(type int), an array of children nodes(type Node), and degree (number of children).
  3.  LeafNode class: This class defines the structure of a leaf node. It extends Node class. It has information regarding the data. It can be modified and more information can be added. Right now, it contains a single data field which is the key value.
  
  Apart from the classes TwoThreeTree.java also have several methods such as insert, remove, delete, keyOrderList, bfsList, updateTree, getValueForKey, height, and numberOfNodes.
  
  ### - insert
  This method adds the given value to the tree. It calls a helper method called insertKey which in turn calls the recursive method insert to add the given value. It returns a boolean value indicating the result of insertion. The time complexity for this operation is O(log N).
  
  ### - search
  This method searches the given value in the tree and returns a boolean indicating the result.
  
  ### - remove
  This method removes the given value from the tree. It calls a helper recursive method called remove to implement this operation. It returns a boolean value indicating the result of the operation. The time complexity of this operation is O(log N).
  
  ### - KeyOrderList
  This method prints all the values stored in the leaf nodes. This is basically an implementation of dfs algorithm for 2-3 trees. Since all the values are stored in the tree in increasing order. The values printed by this method are in ascending order. It does not return anything.
  
  ### - bfsList
  This method prints all the values stored in the tree level by level. This includes the description of tree nodes and leaf nodes as well. It does not return anything.
  
  ### - updateTree
  This method simply updates the values in the tree nodes if they are changed during insertion or deletion. It uses getValueForKey to get the required value and then change it. It does not return anything.
  
  ### - getValueForKey
  This method gets the value for each tree node using the properties of 2-3 trees. It returns an int type of value.
  
  ### - height
  It simply returns the height of the tree.
  
  ### - numberOfNodes
  This method simply returns the number of values present in the tree.
