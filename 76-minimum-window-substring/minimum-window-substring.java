class Solution {
    public String minWindow(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        if(len1<len2)return "";
        int pleft = 0;
        int mlength = Integer.MAX_VALUE;
        int[] arr = new int[128];

        for(char i : t.toCharArray()){
            arr[i]++;
        }
        int count = len2;
        int left = 0;
        int right = 0;
        while(right < len1){
            if(arr[s.charAt(right)]>0){
                count--;
            }
            arr[s.charAt(right)]--;

            while(count == 0){
                if((right-left+1) < mlength){
                    pleft = left;
                    mlength = right - left +1;
                }
                arr[s.charAt(left)]++;
                if(arr[s.charAt(left)]>0){
                    count++;
                }
                left++;
            }
            right++;
            
        }
        if(mlength == Integer.MAX_VALUE)return "";
        return s.substring(pleft, mlength + pleft);

    }
}