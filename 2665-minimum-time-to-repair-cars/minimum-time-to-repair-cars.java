class Solution {
    public long repairCars(int[] ranks, int cars) {
        int max = Integer.MIN_VALUE;
        for(int temp: ranks){
            max = Math.max(temp,max);
        }
        long result = 0;
        long left = 1;
        long right = (long)max*cars*cars;

        while(left <= right){
            long mid = (left + right)/2;
            long countCars = 0;
            
            
            for(int temp : ranks){
                long value = mid / temp;
                countCars += (long)Math.sqrt(value);
            }
            if(countCars >= cars){
                result = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return result;
    }
}