public class Solution {
	public ArrayList<Integer> inorderTraversal(TreeNode a) {
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    Deque<TreeNode> stack = new LinkedList<TreeNode>();
        while(true){
            if(a != null){
                stack.addFirst(a);
                a = a.left;
            }
            else{
                if(stack.isEmpty()){
                    break;
                }
                a = stack.pollFirst();
                result.add(a.val);
                a = a.right;
            }
	}
	return result;
}
}
