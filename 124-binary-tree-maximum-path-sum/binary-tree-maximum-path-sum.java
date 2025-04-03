
class Solution {
    int max = 0;
    int count = 0;
    public int maxPathSum(TreeNode root) {
        if(root == null ) return 0;
        count++;
        if(count == 1)max = root.val;
        int left = maxPathSum(root.left) ;//-6
        int right = maxPathSum(root.right) ;//0
        count--;
        
        if(right < 0 && left < 0){
            max = Math.max(max,root.val);//-1,
        }
        else if(right< 0){
            max = Math.max(max,left+ root.val);
        }
        else if(left<0){
            max= Math.max(max,right+root.val) ;
        }
        else{
             max = Math.max(max,right+left+root.val);
        }

        if(count  == 0)return max ;
        return  Math.max(0,Math.max(left,right))+root.val;
        // if(right <= 0 && left <= 0){
        //     max= Math.max(max,root.val) ;
        // }
        // else{
        //      max = Math.max(max,right+left+root.val);
        // }
    }
}