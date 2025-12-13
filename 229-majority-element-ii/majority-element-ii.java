class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        int cand1 = 0,cand2 = 0;
        int count1 = 0,count2  = 0;

        for(int ele : nums){
            
            if(ele == cand1){
                count1++;
            }
            else if(ele == cand2){
                count2++;
            }
            else if (count1 == 0 ){
                cand1 = ele;
                count1 = 1;
            }
            else if(count2 == 0){
                cand2 = ele;
                count2 =1;
            }
           
            else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for(int ele : nums){
            if(ele == cand1)count1++;
            else if(ele == cand2)count2++;
        }

        if(count1 > nums.length/3)lst.add(cand1);
        if(count2 > nums.length/3)lst.add(cand2);

        return lst;
    }
}