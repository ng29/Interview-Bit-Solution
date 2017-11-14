string sort(vector<int>A);
int myComp(string x, string y){
    return x+y > y+x;
}

string Solution::largestNumber(const vector<int> &A) {
    vector<string>B;
    int i;
    string ans="";
    bool all=true;
    
    for(i=0;i<A.size();i++){
        B.push_back(to_string(A[i]));
        if(A[i]!=0) all=false;
    }
    if(all) return "0";
    sort(B.begin(),B.end(),myComp);
    for(i=0;i<B.size();i++)    
        ans+=B[i];
    return ans;
}
