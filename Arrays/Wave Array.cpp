vector<int> Solution::wave(vector<int> &A) {
     int j,i,temp,a;
     int l=A.size();
    sort(A.begin(),A.begin()+l);
    
     for(i=0;i<l-1;i+=2){
         temp=A[i];
         A[i]=A[i+1];
         A[i+1]=temp;
     }
     return A;
}
