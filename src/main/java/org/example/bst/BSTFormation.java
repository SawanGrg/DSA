package org.example.bst;

public class BSTFormation {

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

    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
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
