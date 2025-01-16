class Solution {
    static long mod = 1000000007;
    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;
        
        long first = helper(5,even,1);
        long second = helper(4,odd,1);
        return (int)((first*second)%mod);

    }

    public static long helper( long x,long p,long ans){
        if(p <=0 ){
            return ans;
        }
        if(p%2==1){
            ans = (ans*x)%mod;
            p = p-1;
        }
        else{
            p = p/2;
            x= (x*x)%mod;
        }
        return helper(x,p,ans);
    }
}