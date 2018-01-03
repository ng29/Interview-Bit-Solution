int Solution::divide(int A, int B) {
    if(A==0)    return 0;
    if(B==0)    return INT_MAX;
    double t1=log(fabs(A));
    double t2=log(fabs(B));
    long long res=double(exp(t1-t2));
    if((A<0)^(B<0)) res=-res;
    if(res>INT_MAX) res=INT_MAX;
    return res;
}
