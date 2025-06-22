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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> st=new Stack<>();
        if(root==null){
            return new ArrayList<>();
        }
        List<Integer> list=new ArrayList<>();
        TreeNode temp=root;
        while(temp!=null||!st.isEmpty()){
            if(temp!=null){
                st.push(temp);
                temp=temp.left;
            }
            else{
                temp=st.pop();
                list.add(temp.val);
                temp=temp.right;
            }
        }
        return list;
    }
}