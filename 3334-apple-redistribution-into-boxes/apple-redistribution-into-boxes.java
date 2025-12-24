class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int total = 0;
        for(int i: apple)total+=i;

        Arrays.sort(capacity);
        int count = 0;
        for(int i = capacity.length - 1; i >= 0; i--){
            total -= capacity[i];
            count++;
            if(total <= 0)return count;
        }
        return count;
    }
}