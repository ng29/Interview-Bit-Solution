int Solution::fibsum(int A) {
    vector<int>fib;
    int count=0,a=1,b=1,i,temp;
    while(a<=A){
        fib.push_back(a);
        temp=a+b;
        a=b;
        b=temp;
    }
    for(i=fib.size()-1;i>=0;i--){
        int num=fib[i];
        while(num<=A){
            A-=num;
            count++;
    }
    if(A==0){
        break;
    }
}
return count;
}
