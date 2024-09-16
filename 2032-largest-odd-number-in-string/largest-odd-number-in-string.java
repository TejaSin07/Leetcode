class Solution {
    public String largestOddNumber(String num) {
     char [] a = num.toCharArray();
     int len = a.length;
     for(int i = len-1;i>=0;i--){
        if(a[i]%2==1){
            return new  String(a).substring(0, i+1);
        }
     }
     return "";   
    }
}