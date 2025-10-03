class Solution {
    public int maxBottlesDrunk(int btl, int exc) {
        int total = btl;
        int empty = btl;

        while(empty >= exc){
            int curEmpty = empty-exc;

            total++;
            empty = curEmpty+1;
            exc++;
        }
        return total;
    }
}