int Solution::titleToNumber(string A) {
    int i,sum=0,expo=0;
    for(i=A.size()-1;i>=0;i--){
        sum+=(A[i]-'A'+1)*pow(26,expo);
        expo++;
    }
    return sum;
}
