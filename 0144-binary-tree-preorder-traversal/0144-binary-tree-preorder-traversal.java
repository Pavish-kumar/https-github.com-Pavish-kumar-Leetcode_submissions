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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        func(list,root);
        return list;
    }
    public List<Integer> func(List<Integer> list,TreeNode root)
    {
        if(root!=null)
        {
            list.add(root.val);
            func(list,root.left);
            func(list,root.right);
        }
        return list;
    }
}