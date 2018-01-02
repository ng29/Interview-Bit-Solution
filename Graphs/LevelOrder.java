public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode a) {
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        if(a==null) return res;
        Queue <TreeNode>q=new LinkedList<>();
        q.add(a);
        int i ;
        while(!q.isEmpty()){
            int c=q.size();
            ArrayList<Integer>level=new ArrayList<>();
            for(i=0;i<c;i++){
            TreeNode cur=q.poll();
            level.add(cur.val);
            
            if(cur.left!=null)  q.add(cur.left);
            if(cur.right!=null)  q.add(cur.right);
        }
        res.add(level);
        }
        return res;
    }
}
