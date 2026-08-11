/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
       return bst(root,null,null);
    }
  boolean  bst(TreeNode root,Integer low ,Integer high){
         if(root==null) return true;
        if(low!=null&&low <= root.val) return false;
        if(high!=null&&high >= root.val) return false;
        boolean left= bst(root.left,root.val,high);
        boolean right=bst(root.right,low,root.val);
        return left&&right;
    }
}