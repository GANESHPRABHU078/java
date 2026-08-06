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
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        path(root, targetSum, new ArrayList<>(), 0);
        return result;
    }

    void path(TreeNode root, int targetSum, List<Integer> list, int sum) {
        if (root == null) {
            return;
        } 
        list.add(root.val);
        sum+=root.val;
        if (root.right == null && root.left == null) {
            System.out.print(list);
            if (sum == targetSum) {
                result.add(new ArrayList<>(list));
                sum = 0;
            }
        }
       
        path(root.right, targetSum, list, sum);
        path(root.left, targetSum, list, sum);
        list.remove(list.size()-1);
    }
}