public class Solution {
    public int height(TreeNode p){
        if(p==null) return 0;
        return 1+Math.max(height(p.left),height(p.right));
    }
    public int isBalanced(TreeNode a) {
        if(a==null) return 1;
        int l=height(a.left);
        int r=height(a.right);
        
        if ((Math.abs(l-r)<=1) && isBalanced(a.right)==1 && isBalanced(a.left)==1)
        return 1;
        
        return 0;
    }
}
