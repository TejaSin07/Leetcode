class Solution {
    public int myAtoi(String s) {
        //trim,result,index,sign
        return helper(s.trim(),0,0,1);
    }

    private static int helper(String s,int index, int result,int sign){

        if(index >= s.length()){
            return result*sign;
        }
        if(index == 0 && (s.charAt(index) == '-' || s.charAt(index) == '+')){
            sign=s.charAt(index)=='-'?-1:1;
            return helper(s,index+1,0,sign);
        }

        if(!Character.isDigit(s.charAt(index))){
            return result*sign;
        }

        int num = s.charAt(index)-'0';

        if((Integer.MAX_VALUE-num)/10 < result ){
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        result = result*10 + num;
        return helper(s,index+1,result,sign);
    }
}