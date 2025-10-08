class Solution {
    public int maxSumSubmatrix(int[][] mat, int k) { // Method to find the maximum sum of a submatrix with sum no more than k
        int m = mat.length; // Get the number of rows in the matrix
        int n = mat[0].length; // Get the number of columns in the matrix
        int res = Integer.MIN_VALUE; // Initialize the result with the smallest possible integer value

        // Iterate through all possible left column boundaries
        for(int left =0 ; left < n ; left++){
            int [] arr = new int[m]; // Initialize a 1D array to accumulate sums for rows within the current column slice
            
            // Iterate through all possible right column boundaries, starting from 'left'
            for(int right = left ; right < n ; right++){
                // For the current column slice [left, right], accumulate row sums
                for(int i =0 ; i< m ; i++){
                    arr[i] += mat[i][right]; // Add the element from the current column 'right' to the corresponding row sum in 'arr'
                }
                res = Math.max(res , helper(arr , k)); // Update the overall maximum result by finding the max sum subarray in 'arr' (representing a submatrix's column sum) that is no more than k
                if(res == k )return k; // If we found a sum exactly equal to k, it's the maximum possible, so return immediately
            }
        }
        return res; // Return the final maximum submatrix sum found
    }

    // Helper method to find the maximum sum of a subarray in a 1D array 'arr' that is no more than 'k'
    public int helper(int [] arr , int k ){   //[1,2,5,1,5,6] and k = 6 try with this 
        TreeSet<Integer> set = new TreeSet<>(); // Use a TreeSet to store prefix sums in sorted order for efficient searching
        set.add(0); // Add 0 to the set to handle subarrays starting from index 0
        int preSum =0; // Initialize the current running prefix sum
        int ans = Integer.MIN_VALUE; // Initialize the answer for this helper method

        // Iterate through each element in the 1D array 'arr'
        for(int i : arr){
            preSum += i; // Update the current prefix sum
            // Find the smallest prefix sum 'target' in 'set' such that 'target' >= 'preSum - k'
            // 'target' represents an 'oldPreSum'. If found, 'preSum - target' will be a subarray sum <= k.
            Integer target = set.ceiling(preSum - k ); 
            if(target != null){ // If such an 'oldPreSum' (target) is found
                ans = Math.max(ans , preSum - target); // Calculate the subarray sum (current_preSum - old_preSum) and update 'ans' if it's larger
            }
            set.add(preSum); // Add the current prefix sum to the TreeSet for future calculations
        }
        return ans; // Return the maximum subarray sum found for 'arr' that is no more than 'k'
    }
}