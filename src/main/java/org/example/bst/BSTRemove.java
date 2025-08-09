package org.example.bst;

public class BSTRemove {

    //find value is enough
    public TreeNode findRootMinimumVal(TreeNode root){
        while(root != null && root.left != null){
            root = root.left;
        }
        return root;
    }

    public TreeNode remove(TreeNode root, int val){
        if(root == null) return null;

        //finding the value
        if(val > root.val){
            root.right = remove(root.right, val);
        }else if ( val < root.val){
            root.left = remove(root.left, val);
        }
        // found the value and remove the value
        else
        {
            //case 1: child is 0 or 1
            if(root.left == null){
                return root.right;
            }else if ( root.right == null){
                return  root.left;
            }else{
                //case 2: child is 2
                TreeNode minRoot = findRootMinimumVal(root.right);
                root.val = minRoot.val;
                root.right = remove(root.right, minRoot.val);
            }
        }
        return root;
    }
}
