class Solution {
    public int maxTwoEvents(int[][] events) {
        // Step 1: Sort events by end time
        Arrays.sort(events,(a,b) -> a[1]==b[1] ? Integer.compare(a[0],b[0]) : Integer.compare(a[1],b[1]));


        int n = events.length;
        int [] dp = new int[n];

        int maxResult = events[0][2];

        for(int i = 0;i<n;i++){

            dp[i] = events[i][2];

            maxResult = Math.max(dp[i],maxResult);

            int prevIndex = findPrev(i-1,events);

            if(prevIndex != -1){
                maxResult = Math.max(maxResult,dp[i]+dp[prevIndex]);
            }

            if (i > 0) {
                dp[i] = Math.max(dp[i], dp[i - 1]);
            }
        } 
        return maxResult;

    }


    public int findPrev(int index,int [][] events){
        if(index < 0)return -1;
        int nextStart = events[index+1][0];
        int high = index;
        int low = 0;
        int result = -1;
            

        while(low <= high){
            
            int mid = low + (high-low)/2;
            if(events[mid][1] < nextStart){
                low = mid+1;
                // result = mid;
            }
            else{
                high = mid-1;
            }
        }
        return high;
    }
}










