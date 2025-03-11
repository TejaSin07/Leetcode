class Solution {
    public int minimumDifference(int[] nums) {
        int totalSum=0;
        for(Integer it:nums){
            totalSum+=it;
        }
        int num1[]=Arrays.copyOfRange(nums,0,nums.length/2);
        int num2[]=Arrays.copyOfRange(nums,nums.length/2,nums.length);
        List<Integer>[] al1=new ArrayList[nums.length/2+1];
        List<Integer>[] al2=new ArrayList[nums.length/2+1];
        for(int i=0;i<al1.length;i++)
            al1[i]=new ArrayList<>();
        for(int i=0;i<al2.length;i++)
            al2[i]=new ArrayList<>();
        generateSum(num1,0,0,al1);
        generateSum(num2,0,0,al2);
        for(int i=0;i<al2.length;i++)
            Collections.sort(al2[i]);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<al1.length;i++){
            for(int sum1:al1[i]){
                for(int j=0;j<al2.length;j++){
                    if(i+j==(nums.length)/2){
                        int val=(totalSum)/2-sum1;
                        /*
                        We need to find index just lower than target so that
                        other remaining subset will be just higher that target
                        and difference will be minimum
                        */
                        int index=bs(al2[j],val);
                        if(index<0){
                             ans=Math.min(ans,Math.abs(totalSum-2*(sum1+al2[j].get(index+1))));
                        }
                        else if(index>=al2[j].size())
                            ans=Math.min(ans,Math.abs(totalSum-2*(sum1+al2[j].get(index-1))));
                        else
                            ans=Math.min(ans,Math.abs(totalSum-2*(sum1+al2[j].get(index))));
                    }
                }
            }
        }
        return ans;
    }
    public void generateSum(int nums[],int index,int mask,List<Integer>[] al){
        if(index==nums.length){
            int key=Integer.bitCount(mask);
            int sum=0;
            for(int i=0;i<nums.length;i++){
                if((mask & (1<<i))!=0){
                    sum+=nums[i];
                }
            }
            al[key].add(sum);
            return;
        }
        generateSum(nums,index+1,mask^(1<<index),al);
        generateSum(nums,index+1,mask,al);
    }

    public int bs(List<Integer> al,int target){
        int l=0,h=al.size()-1;
        int ans=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(al.get(mid)==target){
                return mid;
            }
            if(al.get(mid)<target){
                ans=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return ans;
    }
}