int Solution::removeDuplicates(vector<int> &A) {
    int rep=0,c=1,i;
    int l=A.size();
    
    if(l<=2)    return l;
    for(i=1;i<l;i++){
        if(A[i]==A[i-1] && rep<1){
            A[c++]=A[i];
            rep++;
        }
        else if(A[i]>A[i-1]){
           A[c++]=A[i];
            rep=0; 
        }
    }
    return c;
}
