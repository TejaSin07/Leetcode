class Solution {
    public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    List<List<Integer>> res = new ArrayList<>();
    int first = intervals[0][0];
    int last = intervals[0][1];
        int i = 1;
        while(i< intervals.length){
            if(intervals[i][0] <= last && intervals[i][0] >= first){
                first = Math.min(first,intervals[i][0]);
                last = Math.max(last,intervals[i][1]);
                i++;
            }
            else{
                List<Integer> temp = new ArrayList<>();
                temp.add(first);
                temp.add(last);
                
                if (i < intervals.length) { // Move to the next interval
                    first = intervals[i][0];
                    last = intervals[i][1];
                    i++;
                }
                res.add(temp);   
            } 

      }
            List<Integer> temp = new ArrayList<>();
            temp.add(first);
            temp.add(last);
            res.add(temp); 

        int[][] result = new int[res.size()][2];
        for (int j = 0; j < res.size(); j++) {
            result[j][0] = res.get(j).get(0);
            result[j][1] = res.get(j).get(1); 
        }

        return result;

    }
}