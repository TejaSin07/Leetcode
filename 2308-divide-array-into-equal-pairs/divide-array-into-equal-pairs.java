class Solution {
    public boolean divideArray(int[] nums) {
        int len = nums.length;
        int xor1=0, xor2=0;
        
        for(int i=0;i<len;i++){
            xor1 = nums[i]^xor1;
            xor2 = (nums[i]+1)^xor2;
        }

        return xor1==0 && xor2==0;
    }
}












// class Solution {
//     public boolean divideArray(int[] nums) {
//         int len = nums.length;
//         if(len%2==1)return false;
//         int first = 0;
//         int count = 0;
//         for(int temp : nums){
//             first = temp^first;
//             count++;
//         }

    
//         if(first == 0) return true;
//         return false;
//     }
// }   
        
        
        
        
        
        
        
        
        // Arrays.sort(nums);

        // for(int i = 0;i< nums.length;i +=2){
        //     if((nums[i]^nums[i+1]) != 0){
        //         return false;
        //     }
        // }
        // return true;

    