class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        func(list, root);
        return list;
    }
    public List<Integer> func(List<Integer> list, TreeNode root)
    {
        if(root!=null)
        {
            func(list,root.left);
            list.add(root.val);
            func(list,root.right);
        }
        return list;
    }
}