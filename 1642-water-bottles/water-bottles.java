class Solution {
    public int numWaterBottles(int filled, int exc) {
        int total = 0;
        int empty = 0;

        while (filled > 0) {
            // drink all filled bottles
            total += filled;
            empty += filled;

            // exchange empty bottles for new filled bottles
            filled = empty / exc;
            empty = empty % exc;
        }

        return total;
    }
}
