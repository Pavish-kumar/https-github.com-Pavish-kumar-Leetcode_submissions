class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> st=new Stack<>();
        List<Integer> list=new ArrayList<>();
        TreeNode temp=root,lastVisit=null;
        while(temp!=null||!st.isEmpty()){
            if(temp!=null){
                st.push(temp);
                temp=temp.left;
            }
            else{
                TreeNode peek=st.peek();
                if(peek.right!=null&&lastVisit!=peek.right){
                    temp=peek.right;
                }
                else{
                    list.add(peek.val);
                    lastVisit=st.pop();
                }
            }
        }
        return list;
    }
}