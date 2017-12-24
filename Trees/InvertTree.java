public class Solution {
    
    public TreeNode invertTree(TreeNode a) {
        if(a==null)
        return null;
        
        a.left=invertTree(a.left);
        a.right=invertTree(a.right);
        
        TreeNode temp=a.left;
        a.left=a.right;
        a.right=temp;
        
        return a;
    }
}
