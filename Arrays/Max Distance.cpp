int Solution::maximumGap(const vector<int> &A) {
    vector<bool>temp(A.size());
    int i=A.size()-1,j=A.size()-1,min=A[0],max=0;
    for(i=0;i<A.size();i++){
        if(A[i]>min)    temp[i]=false;
        else{
            temp[i]=true;
            min=A[i];
        }
    }
    LOOP:while(i >= 0){
        if(temp[i] == false){
            i--;
            goto LOOP;
        }
        while((A[i] > A[j]) && (j > i)){
            j--;
        }
        if((j-i) > max){
            max = j-i;
        }
        i--;
    }
    return max;
}
