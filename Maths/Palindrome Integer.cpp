bool Solution::isPalindrome(int A) {
    int orig,rev=0,rem;
    if(A<0) return false;
    orig=A;
    while(A!=0){
        rem=A%10;
        rev=rev*10+rem;
        A/=10;
    }
    
     if(orig==rev)   return true;
    else        return false;
}
