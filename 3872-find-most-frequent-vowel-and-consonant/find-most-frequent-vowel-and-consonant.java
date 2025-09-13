class Solution {
    public int maxFreqSum(String s) {
        int [] arr = new int[26];
        for(int i =0 ; i< s.length() ; i++){
            char ch = s.charAt(i);
            arr[ch - 97]++;
        }
        
        int vowelMax = 0;
        int constant = 0;

        for(int i =0;i< arr.length ; i++){
            if(i== 0 || i ==4 || i==8 || i==14||i==20){
                vowelMax = Math.max(vowelMax , arr[i]);
                
            }else{
                 constant = Math.max(constant , arr[i]);
               
                }
            }
        return vowelMax + constant;
        
    }
}