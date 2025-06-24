/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<TreeNode> ppath=new ArrayList<>();
    List<TreeNode> qpath=new ArrayList<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        find(root,p,ppath);
        find(root,q,qpath);
        TreeNode common=null;
        int minL=Math.min(ppath.size(),qpath.size());
        for(int i=0;i<minL;i++){
            if(ppath.get(i)!=qpath.get(i)){
                break;
            }
            common=ppath.get(i);
        }
        return common;
    }
    public boolean find(TreeNode root,TreeNode target,List<TreeNode> path){
        if(root==null){
            return false;
        }
        path.add(root);
        if(target.val==root.val){
            return true;
        }
        if(find(root.left,target,path)||find(root.right,target,path)){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
}