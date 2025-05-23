class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String s = "1";
        return rle(s,n,2);
    }

    public static String rle(String s,int n,int cur){

        StringBuilder str = new StringBuilder();

        int count =1;
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                str.append(count);
                str.append(s.charAt(i-1));
                count = 1;
            }

        }
        str.append(count);
        str.append(s.charAt(s.length() - 1));
        cur++;
        if(cur <= n)return rle(str.toString(),n,cur);
        return str.toString();
        
    }
}