class Solution {
    public int majorityElement(int[] nums) {
    Map<Integer,Integer>mp = new HashMap<>();
    int ret=0;

    for(int num: nums){
        if(!mp.containsKey(num))
        mp.put(num,1);
        else
        mp.put(num,mp.get(num)+1);
        if(mp.get(num)>nums.length/2){
            ret = num;
            break;
        }
    }
    return ret;
    }
}