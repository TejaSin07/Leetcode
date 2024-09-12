class Solution {
    public int maxProfit(int[] prices) {
        int maxProf = 0;
        int minprice = prices[0];
        for(int i = 1;i<prices.length;i++){
            if(minprice > prices[i]){
                minprice = prices[i];
            }
         
            maxProf = Math.max(maxProf,prices[i]-minprice);
    }
    return maxProf;
    }
}