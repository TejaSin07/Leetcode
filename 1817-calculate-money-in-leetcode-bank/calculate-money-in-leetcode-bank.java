class Solution {
    public int totalMoney(int n) {
        int cycles = n/7;
        int rem = n%7;
        int total = 0;
        int add = 1;
        for(int i = 0;i<cycles;i++){
            int curAdd = add;
            for(int k = 0;k<7;k++){
                total += curAdd;
                curAdd++;
            }
            add++;   
        }

        for(int i = 0;i<rem;i++){
            total += add;
            add++;
        }
        return total;
    }

}