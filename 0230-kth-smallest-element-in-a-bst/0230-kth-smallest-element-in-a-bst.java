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
    private int count=0;
    private int ans=0;
    public int kthSmallest(TreeNode root, int k) {
        count=k;
        dfs(root);
        return ans;
    }
    private void dfs(TreeNode node){
        if(node==null){
            return;
        }
        dfs(node.left);
        if(count==1){
            ans=node.val;
        }
        count--;
        if(count>0){
            dfs(node.right);
        }
    }
}