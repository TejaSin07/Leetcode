class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (char ch : s.toCharArray()) {
            if(Character.toString(ch).equals("(")) {
                count++;//1,2
            }
            else{
                count--;//1
                if(count > 0){
                    sb.append(ch);
                    continue;
                }
            }
            if(count>1){//
                sb.append(ch);//()( 
            }
            
        }
        String result = sb.toString();
        return result;
    }
}