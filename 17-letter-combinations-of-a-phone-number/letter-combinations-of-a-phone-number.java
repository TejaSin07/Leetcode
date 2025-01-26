class Solution {
    public List<String> letterCombinations(String digits) {
        String [] str = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        if(digits.length()== 0){
            return res;
        }

        backTrack(digits,res,temp,str,0);

        return res;
    }

    public void backTrack(String digits, List<String> res, StringBuilder temp,String []str,int ind){
        if(temp.length()==digits.length()){
            res.add(temp.toString());
            return;
        }
        
        int number = digits.charAt(ind)-'0';
        String curr = str[number];
        for(int i= 0; i < curr.length();i++ ){
            temp.append(curr.charAt(i));
            backTrack(digits,res,temp,str,ind+1);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}