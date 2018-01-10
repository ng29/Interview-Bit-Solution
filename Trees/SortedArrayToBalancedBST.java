public class Solution {
    public TreeNode sortedArrayToBST(List<Integer> a, int start, int end) {
	        
	        if(start > end) {
	            return null;
	        }
	        int mid = (start + end)/2;
	        TreeNode root = new TreeNode(a.get(mid));
	        root.left=(sortedArrayToBST(a, start, mid-1));
	        root.right=(sortedArrayToBST(a, mid+1, end));
	        return root;
	    }
	public TreeNode sortedArrayToBST(final List<Integer> a) {
	    return sortedArrayToBST(a, 0, a.size()-1);
	}
}
