class Solution {
    public String shortestPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String rev = sb.toString();
        String str = s +"#" +rev; 

        int pal [] = new int[str.length()];
        int prev = 0;
        for(int i = 1;i< str.length();i++){
            if( str.charAt(i) == str.charAt(prev)){
                prev++;
                pal[i] =  prev;
            }
            else if(prev > 0){
                prev=pal[prev - 1];;
                i--;
            }
            else{
                pal[i] = 0;
            }
        }

        int rem = s.length()-pal[str.length()-1];

        return rev.substring(0,rem)  + s;

    }
}