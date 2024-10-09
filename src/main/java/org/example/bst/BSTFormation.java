package org.example.bst;

public class BSTFormation {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            this.val = value;
            this.left = null;
            this.right = null;
        }
    }
    public TreeNode formation(TreeNode root, int value){
//        if the root is null, then create a new root node
            if(root == null){
                return new TreeNode(value);
            }
//          if the value is smaller than root left value
            if (value < root.val){
                root.left = formation(root.left, value);
            }
//            if the value is greater than root right value
            if(value > root.val){
                root.right = formation(root.right, value);
            }
//            if the node is same with other node than nothing changes to handle redundancy
            return root;
    }

    // Helper method to print the tree (in-order traversal)
    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);        // Visit left subtree
            System.out.print(root.val + " "); // Print the root's value
            inOrder(root.right);       // Visit right subtree
        }
    }

    public static void main(String[] args) {
        TreeNode root = null;
        int[] values = {4,3,2,1,7,5};

        for(int val : values){
            root = new BSTFormation().formation(root, val);
        }
        new BSTFormation().inOrder(root);
    }

}
