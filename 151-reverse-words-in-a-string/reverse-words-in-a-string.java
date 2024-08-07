class Solution {
    public String reverseWords(String s) {
        if(s == null){
            return null;
        }
        char[] a = s.toCharArray();
        int n = a.length;

        reverse(a,0,n-1);
        reverseWords(a,n);
        return cleanSpace(a,n);
    }


    private void reverse(char[] a,int i ,int j) {
    while(i<j){
            char t = a[i];
            a[i++] = a[j];
            a[j--] = t;
        }}

        void reverseWords(char[] a,int n){
            int i = 0 ,j =0;
            while(i<n){
                while(i<j || i< n && a[i] == ' ') i++;
                while(j<i || j < n && a[j] != ' ')j++;
                reverse(a,i,j-1);
            }
        }


         String cleanSpace(char[] a, int n){
            int i = 0, j = 0;
            while(i < n ){
                while(i< n && a[i] == ' ')i++;
                while (i<n && a[i] != ' ')a[j++] = a[i++];
                while(i<n && a[i] == ' ')i++;
                if(i<n){
                    a[j++] = ' ';
                }
            }
            return new String(a).substring(0, j);
        }
    
}