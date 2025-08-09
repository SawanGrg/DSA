package org.example.bst;

public class BSTInsert {

    public TreeNode insert(TreeNode root, int val){
        if(root == null){
            return new TreeNode(val);
        }

        if(root.val < val){
            root.right = insert(root.right, val);
        }else if ( root.val > val){
            root.left = insert(root.left, val);
        }
        return root;
    }

    // In-order traversal: Left -> Root -> Right
    private static void print(TreeNode root) {
        if (root == null) return;
        print(root.left);
        System.out.print(root.val + " ");
        print(root.right);
    }

    public static void main(String[] args) {
        BSTInsert bstInsert = new BSTInsert();

        TreeNode root = new TreeNode(6);
        bstInsert.insert(root, 5);
        bstInsert.insert(root, 12);
        bstInsert.insert(root, 7);
        bstInsert.insert(root, 2);

        print(root);
    }
}
