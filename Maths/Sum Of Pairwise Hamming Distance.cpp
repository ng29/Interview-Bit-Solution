int Solution::hammingDistance(const vector<int> &A) {

    int i,j,c;
    long long int ans=0;
    for(i=0;i<31;i++){
         c=0;
        for(j=0;j<A.size();j++)
            if(A[j]&(1<<i))
            c++;
        ans+=(c*(A.size()-c)*2);
    }
    return ans%1000000007;
}
