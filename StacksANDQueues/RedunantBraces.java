public class Solution {
    public int braces(String A) {
        Stack<Character>s=new Stack<>();
        int i=0;
        while(i<A.length()){
            char c=A.charAt(i);
            if(c=='(' || c=='-' || c=='/' || c=='+' || c=='*')  s.push(c);
            else if(c==')'){
                if(s.peek()=='(')   return 1;
                else{
                    while(!s.isEmpty() && s.peek()!='(')    s.pop();
                    s.pop();
                }
        }i++;
    }return 0;
}
}
