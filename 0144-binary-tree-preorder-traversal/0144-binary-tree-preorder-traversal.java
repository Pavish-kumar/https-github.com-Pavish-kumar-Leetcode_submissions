
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> st=new Stack<>();
        List<Integer> list=new ArrayList<>();
        TreeNode temp=root;
        while(temp!=null||!st.isEmpty()){
            if(temp!=null){
                list.add(temp.val);
                st.push(temp);
                temp=temp.left;
            }
            else{
                temp=st.pop();
                temp=temp.right;
            }
        }
        return list;
    }
}