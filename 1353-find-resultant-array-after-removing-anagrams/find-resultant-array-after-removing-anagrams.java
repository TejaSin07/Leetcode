class Solution {
    public List<String> removeAnagrams(String[] words) {
        
        Stack<String> stk = new Stack<>();
        stk.push(words[0]);
        for(int i = 1;i<words.length;i++){

            String prev = stk.peek();
            String cur = words[i];

            if(!anagrams(prev,cur)){
                stk.push(cur);
            }
        }
        int last = stk.size()-1;
        String[] temp = new String[last+1];
        List<String> ans = new ArrayList<>();
        while(!stk.isEmpty()){
            temp[last] = stk.pop();
            last--;
        }

        for(String str : temp){
            ans.add(str);
        }
        return ans;
    }

    private static boolean anagrams(String prev,String cur){
        int [] arr = new int[26];
        if(prev.length() != cur.length())return false;
        for(int i =0;i<prev.length();i++ ){
            arr[prev.charAt(i)-'a']++;
            arr[cur.charAt(i)-'a']--;
        }

        for(int a:arr){
            if(a!=0)return false;
        }
        return true;
    }
}