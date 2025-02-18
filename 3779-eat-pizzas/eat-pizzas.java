class Solution {
    public long maxWeight(int[] pizzas) {
        Arrays.sort(pizzas);
        int len = pizzas.length;
        int days = len/4;
        long weight = 0;
        int ind = len-1;

        for(int day = 1;day<=days;day += 2){
            weight += pizzas[ind--] ;
        }

        ind--;

        for(int day = 2;day<=days;day+=2){
            weight += pizzas[ind];
            ind = ind-2;
        }
        return weight;
    }
}