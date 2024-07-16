class Solution {
    public String convert(String s, int numRows) {
    String[] strArr = new String[numRows];
    Arrays.fill(strArr,"");
    int j = 0;
    int i;
    int  n = s.length();
    while (j < n){
        i = 0;
        while(i<numRows && j < n){
            strArr[i++] += s.charAt(j++);
        }
        i--;
        while(i > 1 && j< n ){
            strArr[--i] += s.charAt(j++);
        }
}
String res = "";
for(String s1 : strArr){
    res += s1;
}
return res;
}}