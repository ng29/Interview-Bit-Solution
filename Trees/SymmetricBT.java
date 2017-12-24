public class Solution {
    public int check(TreeNode l, TreeNode r){
        if(l==null && r==null)  return 1;
        if(l==null || r==null)  return 0;
        if(l.val!=r.val)        return 0;
        if(check(l.left,r.right)!=1)    return 0;
        if(check(l.right,r.left)!=1)    return 0;
        return 1;
    }
    public int isSymmetric(TreeNode a) {
        if(a==null) return 1;
        return check(a.left,a.right);
    }
}
