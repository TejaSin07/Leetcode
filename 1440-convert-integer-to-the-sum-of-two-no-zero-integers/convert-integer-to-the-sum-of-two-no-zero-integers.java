class Solution {
    public int[] getNoZeroIntegers(int n) {
        int [] arr = new int[2];
        for(int i = 1;i<= n/2;i++){
            int first = i;
            int second = n-i;

            if(check(first) && check(second)){
                arr[0] = first;
                arr[1] = second;
                return arr;
            }
        }
        return arr;
    }

    private boolean check(int ele){
        while(ele > 0){
            if(ele%10 == 0){
                return false;
            }
            else{
                ele = ele/10;
            }
        }
        return true;
    }
}