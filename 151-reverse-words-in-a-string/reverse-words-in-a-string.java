class Solution {
    public String reverseWords(String s) {
        if(s == null){
            return null;
        }
        char[] a = s.toCharArray();
        int n = a.length;

        reverse(a,0,n-1);
        reverseWords(a,n);
        return cleanSpaces(a,n); 
    }
    void reverseWords(char[] a,int n){
        int i = 0,j=0;
        while(i<n){
            while(i<j || i<n && a[i] == ' '){
                i++;
            }
            while(j<i || j< n && a[j] != ' '){
                j++;
            }
            reverse(a,i,j-1);
        }
    }
    public void reverse(char[] a,int i ,int j ){
        while(i<j){
            char t = a[i];
            a[i++] = a[j];
            a[j--] = t;   //we update j here not above
        }

    }

    String cleanSpaces(char[] a,int n ){
        int i = 0,j=0;
        
        while (j < n) {
            while (j < n && a[j] == ' ') {
                j++;             // skip spaces
            }
            while (j < n && a[j] != ' ') {
                a[i++] = a[j++]; // keep non spaces
            }
            while (j < n && a[j] == ' '){
                j++;             // skip spaces
            }
            if (j < n) a[i++] = ' ';                      // keep only one space
        }

        return new String(a).substring(0, i);
    }
    
}