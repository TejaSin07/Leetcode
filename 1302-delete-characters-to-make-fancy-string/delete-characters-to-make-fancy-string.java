class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 1;
        int len = s.length();
        for(int i = 0;i< s.length();i++){
            if(i >0 && s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                count =1;
            }

            if(count<=2){
                ans.append(s.charAt(i));
            }
            if(i == len-1){

            }
        }
        return ans.toString();
    }
}