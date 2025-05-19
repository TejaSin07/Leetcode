class Solution {
    public String reverseWords(String s) {
        char [] arr = s.toCharArray();
        reverseTotal(arr,0,arr.length-1);
        reverseWord(arr);
        return removeSpace(arr);
    }

    public static void reverseTotal(char [] arr,int left,int right){
        while(left <= right){
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }

    public static void reverseWord(char [] arr){
        int j = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != ' '){
                j = i;
                while(j < arr.length && arr[j] != ' ' ){
                    j++;
                }
                reverseTotal(arr,i,j-1);
                i = j -1;
            }
        }

    }

         String removeSpace(char[] a){
            int n = a.length;
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