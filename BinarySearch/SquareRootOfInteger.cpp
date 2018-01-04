int Solution::sqrt(int A) {
   long start=0,end=A/2+1,mid;
   
   if(A==0 ||A==1)  return A;
   while(start<=end){
       mid=(start+end)/2;
       if(mid*mid==A) return (int)mid;
       else if(mid*mid<A)
           start=mid+1;
       else end=mid-1;
   }
   return (int)end;
}
