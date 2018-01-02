public class Solution {
	public long reverse(long n) {
	    long res=0;
    for(long i=0;i<32;i++){
    	res= ( res << 1 ) | ( n & 1 );         
    	n = n >> 1;                  
    }
    return res;
	}
}
