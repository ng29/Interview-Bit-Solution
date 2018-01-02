void step(int a,int b,vector<int>&sol,int n){
    if(n>b) return;
    int ld=n%10;
    if(n>=a)    sol.push_back(n);
    if(ld==0)   step(a,b,sol,n*10 +1);
    else if(ld==9)   step(a,b,sol,n*10 +8);
    else{
        step(a,b,sol, n*10 +ld-1);
        step(a,b,sol, n*10 +ld+1);
    }
}
vector<int> Solution::stepnum(int a, int b) {
    vector<int >sol;
    if(a==0)    sol.push_back(0);
    for(int i=1;i<10;i++)
    step(a,b,sol,i);
    
    if(sol.size() != 0){
        sort(sol.begin(), sol.end());
    }
    return sol;
}
