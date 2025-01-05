class Solution {
    public boolean isIsomorphic(String s, String t) {
       
     int [] ar = new int [128];
     int [] kr = new int [128]; 
    for(int i = 0;i<s.length();i++){
        char m = s.charAt(i);
        char n = t.charAt(i);
        if(ar[m]==0 && kr[n]==0){
            ar[m] = n;
            kr[n] = m;
        }
        else if (ar[m] != n || kr[n] != m){
            return false;
        }
    }
    return true;
    }
}


    //  int [] ar = new int [128];
    //  int [] kr = new int [128];
    //  int sum1= 0;
    //  int sum2 = 0;
    //  for(int i =0;i<s.length();i++){
    //     ar[s.charAt(i)] += 1;
    //     kr[t.charAt(i)] += 1;
    //     sum1 += ar[s.charAt(i)];
    //     sum2 += kr[t.charAt(i)] ;
    //     if(sum1 != sum2){
    //         return false;
    //     }
    //  }
    // return true;