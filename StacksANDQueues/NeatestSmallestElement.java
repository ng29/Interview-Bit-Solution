public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer>ans=new ArrayList<>();
        Stack<Integer>s=new Stack<>();
        if(A==null) return ans;
        for(int i=0;i<A.size();i++){
            int cur=A.get(i);
            
            while(!s.isEmpty() && s.peek()>=cur)    s.pop();
            if(s.isEmpty())    ans.add(-1);
            else                ans.add(s.peek());
            s.push(cur);
        }return ans;
    }
}
