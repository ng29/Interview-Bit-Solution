int min(int a,int b){
    return (a>b)?b:a;
}
int Solution::findMinXor(vector<int> &A) {
    int l=A.size();
    int val=0;
    int minx=INT_MAX;
    sort(A.begin(),A.end());
    for(int i=0;i<l-1;i++){
        val=A[i]^A[i+1];
        minx=min(minx,val);
    }
    return minx;
}
