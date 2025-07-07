package org.example.dfs;

import org.example.bst.TreeNode;

public class DepthFirstSearch {

    // Preorder DFS: Root → Left → Right
    public static void preOrder(TreeNode root) {
        if (root == null) return;

        System.out.print(root.val + ", ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Inorder DFS: Left → Root → Right
    public static void inOrder(TreeNode root) {
        if (root == null) return;

        inOrder(root.left);
        System.out.print(root.val + ", ");
        inOrder(root.right);
    }

    // Postorder DFS: Left → Right → Root
    public static void postOrder(TreeNode root) {
        if (root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + ", ");
    }

    public static void main(String[] args) {
        /*
               50
             /    \
           20      70
          /  \    /  \
        10   30  60  90
        */

        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(20);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(30);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(90);

        // Print DFS traversals
        System.out.print("Preorder: ");
        preOrder(root); // Expected: 50, 20, 10, 30, 70, 60, 90
        System.out.println();

        System.out.print("Inorder: ");
        inOrder(root);  // Expected: 10, 20, 30, 50, 60, 70, 90
        System.out.println();

        System.out.print("Postorder: ");
        postOrder(root); // Expected: 10, 30, 20, 60, 90, 70, 50
        System.out.println();
    }
}
