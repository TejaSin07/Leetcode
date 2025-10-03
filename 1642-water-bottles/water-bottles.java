class Solution {
    public int numWaterBottles(int btl, int exc) {
        int total = btl;
        int empty = btl;

        while(empty >= exc){
            int curTotal = empty/exc;
            int curEmp = empty%exc;

            total += curTotal;
            empty = curTotal + curEmp;
        }
        return total;
    }
}