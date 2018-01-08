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
    public ArrayList<Integer> preorderTraversal(TreeNode a) {
        Stack<TreeNode>s=new Stack<TreeNode>();
        ArrayList<Integer>result=new ArrayList<Integer>();
        s.push(a);
        while(! s.isEmpty()){
            a=s.pop();
            result.add(a.val);
            if(a.right!=null)   s.push(a.right);
            if(a.left!=null)   s.push(a.left);
        }
        return result;
    }
}
