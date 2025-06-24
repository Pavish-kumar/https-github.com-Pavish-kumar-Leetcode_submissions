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
    int res=0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        return helper(root,targetSum);
    }
    public boolean helper(TreeNode root,int target){
        if(root==null){
            return false;
        }
        if(root.left==null&&root.right==null){
            return target-root.val==0;
        }
        return helper(root.left,target-root.val)||helper(root.right,target-root.val);
    }
}