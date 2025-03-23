class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int cnt=0,sum=0;
        Map<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
           sum+=nums[i];
           int ans=sum-goal;
           if(sum==goal){
               cnt++;
           }
           if(map.containsKey(ans)){
               cnt+=map.get(ans);
           }
           map.put(sum,map.getOrDefault(sum,0)+1);
       }
        return cnt;
    }
}