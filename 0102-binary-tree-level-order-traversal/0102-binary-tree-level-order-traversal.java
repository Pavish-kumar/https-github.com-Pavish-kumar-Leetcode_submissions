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
        if(root==null){
            return list;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int currSize=q.size();
            List<Integer> nestedList=new ArrayList<>();
            for(int i=0;i<currSize;i++){
                TreeNode s=q.poll();
                nestedList.add(s.val);
                if(s.left!=null){
                    q.offer(s.left);
                }
                if(s.right!=null){
                    q.offer(s.right);
                }
            }
            list.add(nestedList);
        }
        return list;
    }
}