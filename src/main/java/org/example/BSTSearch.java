package org.example;

public class BSTSearch {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public boolean searchBST(TreeNode root, int val){

        if (root == null) {
            return false; // Return false if the root is null (value not found)
        }

        if (root.val == val) {
            return true; // Value is found
        }

        if (val < root.val){
            return searchBST(root.left, val);
        }

        if(val > root.val){
            return searchBST(root.right, val);
        }
        return false;
    }

    public static void main(String[] args) {
        BSTSearch bst = new BSTSearch();
        BSTSearch.TreeNode root = bst.new TreeNode(4);

        // Creating the tree
        root.left = bst.new TreeNode(2);
        root.right = bst.new TreeNode(7);
        root.left.left = bst.new TreeNode(1);
        root.left.right = bst.new TreeNode(3);

        int valToSearch = 2;

        if(bst.searchBST(root, valToSearch)){
            System.out.println("exist");
        }else{
            System.out.println("it doesnot exist");
        }

    }
}
