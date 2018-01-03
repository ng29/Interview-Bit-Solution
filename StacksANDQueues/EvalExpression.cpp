int Solution::evalRPN(vector<string> &A) {
    stack<int >st;
    for(auto s:A){
        if(s.size()>1||isdigit(s[0]))   st.push(stoi(s));
        else{
            auto x2=st.top();   st.pop();
            auto x1=st.top();   st.pop();
            switch(s[0]) {
                case '+': x1+=x2; break;
                case '-': x1-=x2; break;
                case '*': x1*=x2; break;
                case '/': x1/=x2; break;
            }
            st.push(x1);
        }
    }return st.top();
}
