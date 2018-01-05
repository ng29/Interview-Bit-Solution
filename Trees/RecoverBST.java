public class Solution {
    TreeNode fsp=null;
    TreeNode lep=null;
    TreeNode prev=null;
    public void FindSegment(TreeNode root){
        if(root==null)  return ;
        FindSegment(root.left);
        if(prev!=null){
            if(prev.val>root.val){
                if(fsp==null)    fsp=prev;
                lep=root;
            }
        }
        prev=root;
        FindSegment(root.right);
    }
    public ArrayList<Integer> recoverTree(TreeNode root) {
        ArrayList<Integer>res=new ArrayList<Integer>();
        FindSegment(root);
        int x=fsp.val;
        fsp.val=lep.val;
        lep.val=x;
        res.add(fsp.val);
        res.add(lep.val);
        return res;
    }
}
