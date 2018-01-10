public class Solution {
    public TreeNode con(ArrayList<Integer> a,int s,int e){
        if(s>e) return null;
        int max=Integer.MIN_VALUE;
        int maxIndex=0,i;
        
        for(i=s;i<=e;i++){
            if(a.get(i)>max){
                max=a.get(i);
                maxIndex=i;
            }
        }
        TreeNode root=new TreeNode(max);
        root.left=con(a,s,maxIndex-1);
        root.right=con(a,maxIndex+1,e);
        return root;
    }
    public TreeNode buildTree(ArrayList<Integer> a) {
        if(a.size()==0) return null;
        return con(a,0,a.size()-1);
    }
}
