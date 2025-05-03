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
    private int largestDiameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return largestDiameter;
    }
    private int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int lh=height(node.left);
        int rh=height(node.right);
        largestDiameter=Math.max(largestDiameter,lh+rh);
        return 1+Math.max(lh,rh);
    }
}