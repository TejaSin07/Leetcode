class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int [] arr = new int[3];
        int left = 0;
        for(int right = 0;right < s.length();right++){
           
            arr[s.charAt(right)-97]++;
            while(arr[0] >0 && arr[1] > 0 && arr[2] >0) {
                count += s.length() - right;
                arr[s.charAt(left)-97]--;
                left++;
            }

        }
        return count;
    }
}