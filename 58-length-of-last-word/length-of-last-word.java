class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
// s.charAt(i)
        for(int i = s.length()-1;i >= 0;i-- ){
            if(s.charAt(i) == ' '){
                if(length>0){
                    return length;
                }
            }
            else{
                length += 1;
            }
            
        }
        return length;
    }
}