string Solution::convertToTitle(int n) {
    return n == 0 ? "" : convertToTitle(n / 26) + (char) (--n % 26 + 'A');
}
