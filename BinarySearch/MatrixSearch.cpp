int Solution::searchMatrix(vector<vector<int> > &A, int B) {
    if(A.empty() || A[0].empty())   return 0;
    
    int m=A.size(),n=A[0].size();
    int start=0,end=m*n-1,mid;
    
    while(start<=end){
        mid=(start+(end-start)/2);
        int e=A[mid/n][mid%n];
        if(B<e)         end=mid-1;
        else if(B>e)    start=mid+1;
        else            return 1;
    }
    return 0;
}
