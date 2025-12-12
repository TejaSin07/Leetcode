class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String ,List<String>> ans = new HashMap<>();

        for(String st :strs){

            char [] ch = st.toCharArray();

            Arrays.sort(ch);

            String k = new String(ch);
            if(!ans.containsKey(k)){
                ans.put(k,new ArrayList());
            }
            ans.get(k).add(st);

        }
        return new ArrayList<>(ans.values());
    }
}