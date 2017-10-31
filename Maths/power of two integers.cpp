bool Solution::isPower(int A) {
    int i,j;
    if(A==1)    return true;
    for(i=2;i<32;i++){
        for(j=2;j<=pow(INT_MAX,1.0/i);j++){
            if(pow(j,i)==A){
                return true;
            }
        }
    }
    return false;
}
