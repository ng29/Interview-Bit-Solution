bool Solution::hotel(vector<int> &arrive, vector<int> &depart, int K) {
    int a=0,d=0,start,end,l;
    l=arrive.size();
    sort(arrive.begin(),arrive.end());
    sort(depart.begin(),depart.end());
    start=arrive[0];
    end=depart[l-1];
    for(;start<=end;start++){
        while((d<l) && (start==depart[d])){
            K++;
            d++;
        }
        while((a<l) && (start==arrive[a])){
            if(K>0)
                K--;
            else    
                return false;
            a++;
        }
}
return true;
}
