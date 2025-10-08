class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int ans = Integer.MIN_VALUE;

        for(int left = 0;left< cols;left++){

            int val [] = new int[rows];

            for(int right = left;right < cols;right++){

                for(int i = 0;i<rows;i++){
                    val[i] += matrix[i][right];
                }

                ans = Math.max(ans,helper(val,k));
            }
        }
        return ans;
    }


    private static int helper(int [] arr,int k){
        int prefix = 0;
        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);
        int ans = Integer.MIN_VALUE;
        for(int val : arr){
            prefix += val;
            Integer target = set.ceiling(prefix-k);
            if(target != null){
                ans = Math.max(ans,prefix-target);
            }

            set.add(prefix);
        }
        return ans;
    }
}