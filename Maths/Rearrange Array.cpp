void Solution::arrange(vector<int> &A) {
    int i,l;
    l=A.size();
    for(i=0;i<l;i++){
        A[i]+=(A[A[i]]%l)*l;
    }
    for(i=0;i<l;i++){
         A[i]/=l;
    }
}
