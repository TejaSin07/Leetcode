class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>>  lst = new ArrayList<>();
        int last =(int) Math.pow(2,nums.length);
        // lst.add(new ArrayList<>());

        for(int ele = 0;ele<last;ele++){

            int ind = 0;
            List<Integer> ans = new ArrayList();
            int num = ele;
            while(num > 0){

                if((num & 1) == 1){
                    ans.add(nums[ind]);
                }
                ind++;
                num=num>>1;
            }
            lst.add(ans);
        }
        return lst;
    }
}