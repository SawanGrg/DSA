package org.example.bfs;

import org.example.bst.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public static void bfs(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;

        while (!queue.isEmpty()) {

            int levelSize = queue.size();
            System.out.println("Level " + level + ":");

            for (int i = 0; i < levelSize; i++) {

                TreeNode current = queue.remove();
                System.out.print(current.val + " ");

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            System.out.println();
            level++;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(20);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(30);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(90);

        bfs(root); // Call the BFS function
    }
}
