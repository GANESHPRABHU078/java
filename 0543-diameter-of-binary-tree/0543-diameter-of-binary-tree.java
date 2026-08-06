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
    int d =0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root,0);
        return d;
    }
    int dfs(TreeNode root,int curr){
        if(root==null){
            return 0;
        }
        
       int l= dfs(root.left,curr);
        int r=dfs(root.right,curr);
        d=Math.max(l+r,d);
        return Math.max(l,r)+1;
    }
}