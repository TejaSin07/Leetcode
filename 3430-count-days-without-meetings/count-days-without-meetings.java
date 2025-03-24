class Solution {

    public int countDays(int days, int[][] meetings) {
        int freeDays = 0, latestEnd = 0;

        // Sort meetings based on starting times
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));

        for(int temp[] : meetings){
            int start = temp[0];
            int end = temp[1];

            if(start > latestEnd ){
                freeDays += start - latestEnd -1;
               
            }
            latestEnd = Math.max(latestEnd,end);

        }
        freeDays += days - latestEnd;
        return freeDays;
    }
}