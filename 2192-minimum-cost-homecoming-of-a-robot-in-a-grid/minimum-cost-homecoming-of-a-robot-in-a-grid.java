class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int si = startPos[0], sj = startPos[1];
        int ei = homePos[0], ej = homePos[1];
        int cost = 0;

        // Move row-wise
        if (si < ei) { // going down
            for (int r = si + 1; r <= ei; r++) {
                cost += rowCosts[r];
            }
        } else { // going up
            for (int r = si - 1; r >= ei; r--) {
                cost += rowCosts[r];
            }
        }

        // Move column-wise
        if (sj < ej) { // going right
            for (int c = sj + 1; c <= ej; c++) {
                cost += colCosts[c];
            }
        } else { // going left
            for (int c = sj - 1; c >= ej; c--) {
                cost += colCosts[c];
            }
        }

        return cost;
    }
}
