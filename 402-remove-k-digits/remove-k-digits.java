class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stk = new Stack<>();
        int len = num.length();
        for(int i = 0;i < len ;i++){
            while(!stk.isEmpty() && k >0 && (stk.peek() -'0') >(num.charAt(i) -'0')){
                    stk.pop();
                    k = k-1;
            }
            stk.push(num.charAt(i));
        }
        while(k > 0){
            stk.pop();
            k--;
        }
        if(stk.isEmpty())return "0";

        String res = "";
        while(!stk.isEmpty()){
            res = res+stk.pop();
        }
        
        String reversed = new StringBuilder(res).reverse().toString();

        // Step 2: Remove leading zeros
        String trimmed = reversed.replaceFirst("^0+", "");
        if(trimmed.length() == 0){
            return "0";
        }
        return trimmed;

    }
}