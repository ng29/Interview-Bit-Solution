/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public ArrayList<Integer> postorderTraversal(TreeNode a) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode>s1=new Stack<TreeNode>();
        Stack<TreeNode>s2=new Stack<TreeNode>();
        s1.push(a);
        while(! s1.isEmpty()){
            a=s1.pop();
                s2.push(a);
                if(a.left!=null)    s1.push(a.left);
                if(a.right!=null)    s1.push(a.right);
            }
            
            while(!s2.isEmpty()){
                a=s2.pop();
                result.add(a.val);
            }
        
        return result;
    }
}
