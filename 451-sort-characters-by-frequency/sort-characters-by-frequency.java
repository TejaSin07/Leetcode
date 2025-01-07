class Solution {
    public String frequencySort(String s) {
        HashMap <Character,Integer> map = new HashMap<>();
        int maxfreq = 0;
        for(char  ch : s.toCharArray()){
            maxfreq = Math.max(map.getOrDefault(ch,0)+1,maxfreq);
            map.put(ch,map.getOrDefault(ch,0)+1);
        } 
       
        List<Character> bucket[] = new List[maxfreq+1];
        for(int i =0;i<=maxfreq;i++){
            bucket[i] = new ArrayList();
        }

        for(Map.Entry<Character,Integer> entry: map.entrySet() ){
            char ch = entry.getKey();
            int freq = entry.getValue();
            bucket[freq].add(ch);
        }

        StringBuilder result = new StringBuilder();
        for(int i = maxfreq;i>0;i--){
            for(char ch:bucket[i] ){
                for(int j = 0;j<i;j++){
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }
}