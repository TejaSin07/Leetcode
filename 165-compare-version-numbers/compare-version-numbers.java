class Solution {
    public int compareVersion(String ver1, String ver2) {
        int v1 = 0;
        int v2 = 0;
        int len1 = ver1.length();
        int len2 = ver2.length();
        while(v1 < len1 || v2 < len2){

            int num1 = 0;

            while(v1<len1 && ver1.charAt(v1) != '.' ){
                num1 = num1*10 + (ver1.charAt(v1)-'0');
                v1++;
            }


            int num2 = 0;

            while(v2<len2 && ver2.charAt(v2) != '.' ){
                num2 = num2*10 + (ver2.charAt(v2)-'0');
                v2++;
            }

            if(num1 > num2)return 1;
            else if(num2 > num1)return -1;
            v1++;
            v2++;

        }
        return 0;
    }
}