int Solution::firstMissingPositive(vector<int> &A) {
   int i,l,cur;
   l=A.size();
   
   for(i=0;i<l;i++){
       cur=A[i];
       if(cur<=0 || cur>l || cur==i+1)  continue;
       swap(A[i],A[cur-1]);
       if(A[i]!=A[cur-1])   i--;
   }
   for(i=0;i<l;i++)
       if(A[i]!=i+1)    
       return i+1;
 return l+1;  
}
