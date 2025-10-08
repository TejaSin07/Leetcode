class Solution {
    
    public int[] avoidFlood(int[] rains) {
        int len = rains.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        TreeSet<Integer> set = new TreeSet<>();
        int ans[] = new int [len];
        Arrays.fill(ans,1);
        for(int i = 0;i< len;i++){
            int val = rains[i];
            if(val == 0){
                set.add(i);
            }
            else{
                ans[i] = -1;
                if(map.containsKey(val)){
                    int curInd = map.get(val);
                    Integer posInd = set.ceiling(curInd);
                    if(posInd == null){
                        return new int[0];
                    }
                    ans[posInd] = val; 
                    set.remove(posInd);

                }
            }
            map.put(val,i);
        }
        return ans;
    }

}

//hassmap : lake : index

// treeset : 0's index

// array : ans : size == rains.length