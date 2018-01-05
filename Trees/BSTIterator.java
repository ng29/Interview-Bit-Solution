public class Solution {
    Stack<TreeNode>stack;
    public Solution(TreeNode root) {
        stack=new Stack<>();
        TreeNode cur=root;
        while(cur!=null){
            stack.push(cur);
            if(cur.left!=null)  cur=cur.left;
            else                break;
        }
    }
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }
    /** @return the next smallest number */
    public int next() {
        TreeNode node=stack.pop();
        TreeNode cur=node;
        if(cur.right!=null){
            cur=cur.right;
            while(cur!=null){
                stack.push(cur);
                if(cur.left!=null)  cur=cur.left;
                else                break;
            }
        }
        return node.val;
    }
}

/**
 * Your Solution will be called like this:
 * Solution i = new Solution(root);
 * while (i.hasNext()) System.out.print(i.next());
 */
