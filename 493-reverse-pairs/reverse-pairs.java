class Solution {
    public int reversePairs(int[] nums) {
        int [] count = new int[1];
        mergeSort(nums,0,nums.length-1,count);
        return count[0];
    }


    public void mergeSort(int [] nums,int left,int right,int[]count){
        if(left>= right)return ;
        int mid = left + (right-left)/2;
        mergeSort(nums,left,mid,count);
        mergeSort(nums,mid+1,right,count);
        merge(nums,left,mid,right,count);
    }

    public void merge(int [] nums ,int left ,int mid,int right,int[] count){
            int j = mid + 1;

    // Count the reverse pairs
        for (int i = left; i <= mid; i++) {
            while (j <= right && (long)nums[i] > 2L * nums[j]) {
                j++;
            }
            count[0] += (j - (mid + 1));
        }
        int l = left ;
        int r = mid+1;
    
        ArrayList<Integer> list = new ArrayList<>();
        while(l <= mid && r  <= right){ //before executing this condition left & right part always be sorted
            
            if(nums[l] > nums[r]){
                list.add(nums[r++]);
            }
            else{
                list.add(nums[l++]);
            }
        }

        while(l <= mid){
            list.add(nums[l++]);
        }
        while(r<=right){
            list.add(nums[r++]);
        }

        for(int i = 0;i<list.size();i++){
            nums[left++] = list.get(i);
        }
    }
}