public class Solution {
    ArrayList<Integer> p,in;
    public TreeNode con(int s,int e,int i){
        if(s>e)    return null;
        int val=p.get(i);
        TreeNode root=new TreeNode(val);
        int j=s;
        for(;j<=e;j++){
            if(root.val==in.get(j).intValue()){
                break;
            }}
        root.left=con(s,j-1,i+1);
        root.right=con(j+1,e,i+j-s+1);
        
        return root;
    }
                        
    public TreeNode buildTree(ArrayList<Integer> p, ArrayList<Integer> in) {
        this.p = p;
	    this.in = in;
        
        return con(0,p.size()-1,0);
    }
}
