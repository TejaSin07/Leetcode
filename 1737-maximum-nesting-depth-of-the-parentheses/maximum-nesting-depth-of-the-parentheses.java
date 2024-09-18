class Solution {
    public int maxDepth(String s) {
        int cur = 0;
        int maxCount = 0;
        for(int i = 0;i< s.length();i++){
            if(s.charAt(i) == '('){
                cur += 1;
                maxCount =Math.max(maxCount,cur);
            }
            else if(s.charAt(i)== ')'){
                cur -= 1;
            }
        }
        return maxCount;
    }
}