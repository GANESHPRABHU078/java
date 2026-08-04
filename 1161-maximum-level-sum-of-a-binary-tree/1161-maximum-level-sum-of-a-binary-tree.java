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
    public int maxLevelSum(TreeNode root) {
        int max =Integer.MIN_VALUE;
        Queue<TreeNode> que =new LinkedList<>();
        que.offer(root);
        int l=0;
        int lm=0;
        while(!que.isEmpty()){
            int size=que.size();
            int sum=0;
             l++;
            for(int i=0;i<size;i++){
                TreeNode curr=que.poll();
                sum+=curr.val;
                if(curr.left!=null) que.offer(curr.left);
                if(curr.right!=null) que.offer(curr.right);
            }
            if(max<sum){
                max =sum;
                lm=l;
            }
        }
        return lm;
    }
}