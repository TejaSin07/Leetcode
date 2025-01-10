class Solution {
    public int beautySum(String s) {
        int sum=0;
        for(int start = 0;start < s.length()-1;start++){
            sum += helperCount( s,start);//aabca
        }
        return sum;
    }

    private static int helperCount(String s,int start){
        int charAr[] = new int[26];
        int end = start;
        int max = 0;
        
        int count=0;
        while(end< s.length()){

             charAr[s.charAt(end)-'a']++;
             max = Math.max(charAr[s.charAt(end)-'a'],max);
            int min = Integer.MAX_VALUE;
             for (int freq : charAr) {
               
                if (freq > 0) { // Only consider characters that exist in the substring
                    min = Math.min(min, freq);
                }
                
            }
             count += (max-min);
             end++;
        }
        return count;
    }
}