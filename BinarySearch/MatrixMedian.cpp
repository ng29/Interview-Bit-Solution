int Solution::findMedian(vector<vector<int> > &A) {
    // int min = A[0][0], max = A[0][0];
    // int r,c,i;
    // r=A.size(),c=A[0].size();
    // for(i=0;i<r;i++){
    //     if(A[i][0]<min) min=A[i][0];
    //     if(A[i][c-i]>max)   max=A[i][c-i];
    // }
    // int des=(r*c+1)/2;
    // while(min<max){
    //     int mid=min+(max-min)/2;
    //     int place=0;
    //     for(i=0;i<r;i++)
    //     place+=upper_bound(A[i].begin(),A[i].end(),mid)-A[i].begin();
    //     if(place<des)   min=mid+1;
    //     else            max=mid;
    // }
    // return min;
    
     int l = 0, r = INT_MAX;
    int mid, req = (int)A.size() * (int)A[0].size();
    assert(req % 2);
    while(r - l > 1){
        mid = l + (r - l) / 2;
        int cnt = 0;
        for(auto &i: A){ 
            //using upper bound in a sorted array to count number of elements smaller than mid
            int p = upper_bound(i.begin(), i.end(), mid) - i.begin();
            cnt += p;
        }
        if(cnt >= (req/2 +1)) r = mid;
        else l = mid;
    }   
    return r;
}
