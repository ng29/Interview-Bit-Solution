public class Solution {
    int searchInorder(int v, ArrayList<Integer> in, int is, int ie)
    {
        int i = is;
        for (; i <= ie; i++)
        {
            if (v == in.get(i)) break;
        }
        return i;
    }
     
    public TreeNode buildTree(ArrayList<Integer> in,int is,int ie,
                    ArrayList<Integer> po,int ps,int pe){
     if(is>ie || ps>pe)  return null;
     TreeNode root=new TreeNode(po.get(pe));
     //int ri=hm.get(po.get(pe));
     int ri=searchInorder(root.val, in, is, ie);
     
     int sizeOfLeftSubTree = ri - is;
     int sizeOfRightSubTree = ie - ri;
     
     root.right=buildTree(in, ri + 1, ie, 
                                po, pe-sizeOfRightSubTree, pe-1);
     root.left=buildTree(in, is, ri - 1,po, pe-sizeOfRightSubTree-sizeOfLeftSubTree,
                            pe-sizeOfRightSubTree-1);
     return root;
    }
    
    public TreeNode buildTree(ArrayList<Integer> in, ArrayList<Integer> po) {
        // HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
        // for(int i=0;i<in.size();i++)
        // hm.put(in.get(i),i);
        return buildTree(in,0,in.size()-1,po,0,po.size()-1);
    }
}
