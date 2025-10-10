class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int len = energy.length;
        int [] stored = new int[len];
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<len;i++){

            if((i-k) < 0){
                stored[i] = energy[i];
            }
            else{
                stored[i] = Math.max(energy[i],stored[i-k]+ energy[i]);
            }

            if(i >= len-k){
                max = Math.max(max,stored[i]);
            }

        }
        return max;
    }
}