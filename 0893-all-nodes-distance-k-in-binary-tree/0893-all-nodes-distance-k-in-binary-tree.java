class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> res=new ArrayList<>();
        makeParents(root);
        bfs(target,k,res);
        return res;
    }
    private Map<TreeNode,TreeNode> parentMap=new HashMap<>();
    private void makeParents(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left!=null){
            parentMap.put(root.left,root);
            makeParents(root.left);
        }
        if(root.right!=null){
            parentMap.put(root.right,root);
            makeParents(root.right);
        }
    }
    private void bfs(TreeNode target,int k,List<Integer> res){
        Queue<TreeNode> q=new LinkedList<>();
        Set<TreeNode> visit=new HashSet<>();
        q.offer(target);
        visit.add(target);
        int cud=0;
        while(!q.isEmpty()){
            if(cud==k){
                break;
            }
            int cs=q.size();
            for(int i=0;i<cs;i++){
                TreeNode temp=q.poll();
                if(temp.left!=null&&!visit.contains(temp.left)){
                    q.offer(temp.left);
                    visit.add(temp.left);
                }
                if(temp.right!=null&&!visit.contains(temp.right)){
                    q.offer(temp.right);
                    visit.add(temp.right);
                }
                TreeNode temp2=parentMap.get(temp);
                if(temp2!=null&&!visit.contains(temp2)){
                    q.offer(temp2);
                    visit.add(temp2);
                }
            }
            cud++;
        }
        while(!q.isEmpty()){
            res.add(q.poll().val);
        }

    }
}