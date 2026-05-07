package com.example.oops;
class Node {
    int data;
    Node left;
    Node right;

    // Constructor to initialize the node
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class DistanceKFromRoot {


 // Recursive function to print all nodes at distance k from the root.

    public static void printNodesAtDistanceK(Node root, int k) {
        // Base case: if the tree is empty
        if (root == null) {
            return;
        }

        // If k is 0, we have reached the desired level
        if (k == 0) {
            System.out.print(root.data + " ");
            return;
        }

        // Recursively call left and right subtrees
        // Decrease k by 1 as we go down one level
        printNodesAtDistanceK(root.left, k - 1);
        printNodesAtDistanceK(root.right, k - 1);
    }

    public static void main(String[] args) {

         // Creating a sample binary tree:


        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k = 2;

        System.out.println("Nodes at distance " + k + " from root:");
        printNodesAtDistanceK(root, k);
    }
}
