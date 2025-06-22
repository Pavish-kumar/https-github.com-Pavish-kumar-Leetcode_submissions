class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Stack<List<Integer>> st=new Stack<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int cs=q.size();
            List<Integer> inlist=new ArrayList<>();
            for(int i=0;i<cs;i++){
                TreeNode temp=q.poll();
                inlist.add(temp.val);
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
            st.add(inlist);
        }
    while(!st.isEmpty()){
        list.add(st.pop());
    }
    return list;
    }
}