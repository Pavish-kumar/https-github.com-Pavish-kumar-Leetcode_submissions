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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null) return list;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int ls=q.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<ls;i++){
                TreeNode c=q.poll();
                level.add(c.val);
                if(c.left!=null)q.offer(c.left);
                if(c.right!=null)q.offer(c.right);
            }
            list.add(level);
        }
        return list;
    }
}