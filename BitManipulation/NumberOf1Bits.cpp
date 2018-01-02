int Solution::numSetBits(unsigned int A) {
    int ans=0;
    while(A){
        ans++;
        A &=A-1;
    }
    return ans;
}
