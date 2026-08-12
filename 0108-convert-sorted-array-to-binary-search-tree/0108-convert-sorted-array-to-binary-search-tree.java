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
    public TreeNode sortedArrayToBST(int[] nums) {
        return insert(nums,0,nums.length-1);
    }
    TreeNode insert(int[] nums,int left,int rigth){
        if(left>rigth) return null;
        int mid = left+(rigth - left)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = insert(nums,left,mid-1);
        root.right = insert(nums,mid+1,rigth);
        return root;
    }    
}