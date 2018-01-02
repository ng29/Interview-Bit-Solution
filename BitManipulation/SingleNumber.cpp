int Solution::singleNumber(const vector<int> &A) {
    int l=A.size();
    int ans=0;
    for(int i=0;i<l;i++){
        ans^=A[i];
    }
    return ans;
}
