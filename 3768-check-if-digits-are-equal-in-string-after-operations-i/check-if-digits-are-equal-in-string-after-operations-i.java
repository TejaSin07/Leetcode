class Solution {
    public boolean hasSameDigits(String s) {
        int[] temp = new int[s.length()];
        for(int i =0;i<temp.length;i++){
            temp[i]=s.charAt(i)-'0';
        }
        int p = temp.length;
        while(p>2){
            for(int i =0;i<p-1;i++){
                temp[i]=(temp[i]+temp[i+1])%10;
            }
            p--;
        }
     return temp[0]==temp[1];   
    }
}