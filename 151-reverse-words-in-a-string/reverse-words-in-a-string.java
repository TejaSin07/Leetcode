class Solution {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) return "";

        char[] a = s.toCharArray();
        int n = a.length;

        // Step 1: Reverse the whole string
        reverse(a, 0, n - 1);
        // Step 2: Reverse each word
        reverseWords(a, n);
        // Step 3: Clean up spaces
        return cleanSpaces(a, n);
    }

    void reverseWords(char[] a, int n) {
        int i = 0, j = 0;

        while (i < n) {
            while (i < j || i < n && a[i] == ' ') i++; // Skip spaces
            while (j < i || j < n && a[j] != ' ') j++; // Skip non-spaces
            reverse(a, i, j - 1);                      // Reverse the word
        }
    }

    // Trim leading, trailing, and multiple spaces
    String cleanSpaces(char[] a, int n) {
        int i = 0, j = 0;

        while (j < n) {
            while (j < n && a[j] == ' ') j++;             // Skip spaces
            while (j < n && a[j] != ' ') a[i++] = a[j++]; // Keep non-spaces
            while (j < n && a[j] == ' ') j++;             // Skip spaces
            if (j < n) a[i++] = ' ';                      // Keep only one space
        }

        return new String(a).substring(0, i);
    }

    // Reverse a[] from a[i] to a[j]
    private void reverse(char[] a, int i, int j) {
        while (i < j) {
            char t = a[i];
            a[i++] = a[j];
            a[j--] = t;
        }
    }
}