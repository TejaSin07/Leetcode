class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int k = 0;
        for(int i = n-1;i>=0;i--){
            if(digits[i]==9){
                k++;
                digits[i]= 0;
            }
            else{
                digits[i]++;
                return digits;
            }
        }
        if(k == n){
            int [] arr = new int[n+1];
            arr[0] = 1;
            return arr;
        }
        return digits;
    }
}