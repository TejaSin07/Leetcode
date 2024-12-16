class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0,count2 = 0;
        int cand1= 0,cand2 =0;
        for(int i = 0;i<nums.length;i++){
            if(count1 == 0 &&  nums[i] != cand2){
                count1 =1;
                cand1= nums[i];
            }
            else  if(count2 == 0 &&  nums[i] != cand1){
                count2 =1;
                cand2= nums[i];
            }
            else if (nums[i]== cand1){
                count1++;
            }
            else if (nums[i]== cand2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        List<Integer> result = new ArrayList<>();
        int threshold = nums.length/3;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == cand1){
                count1++;
            }
            else if(nums[i]==cand2){
                count2++;
            }
        }

        if(count1 > threshold){
            result.add(cand1);
        }
        if(count2>threshold){
            result.add(cand2);
        }
        return result;
    }
}