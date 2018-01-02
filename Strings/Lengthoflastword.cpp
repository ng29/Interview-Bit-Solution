int Solution::lengthOfLastWord(const string a) {
    int len=0,tail=a.size()-1;
    while(tail>=0 &&a[tail]==' ') tail--;
    while(tail>=0&&a[tail]!=' '){
        len++;
        tail--;
    }
    return len;
}
