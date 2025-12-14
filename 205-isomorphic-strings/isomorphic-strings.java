class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        var map1=  new HashMap<Character,Character>();
        var map=  new HashMap<Character,Character>();

        for(int i = 0;i<s.length();i++){

            if(map1.containsKey(s.charAt(i))){
                if(map1.get(s.charAt(i)) != t.charAt(i))return false;
            }
            if(map.containsKey(t.charAt(i))){
                if(map.get(t.charAt(i)) != s.charAt(i))return false;
            }

            map1.put(s.charAt(i),t.charAt(i));
            map.put(t.charAt(i),s.charAt(i));
        }
        return true;

    }
}