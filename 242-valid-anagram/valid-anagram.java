class Solution {
    public boolean isAnagram(String s, String t) {
        // Check if the lengths of both strings are different. If yes, they cannot be anagrams.
        if(s.length() != t.length()) return false;

        // Create two arrays to store the frequency of each character for both strings.
        // Arrays have a size of 200 to accommodate any potential Unicode characters (not just standard ASCII).
        int map1[] = new int[200];
        int map2[] = new int[200];

        // Traverse through both strings simultaneously to populate the frequency arrays.
        for(int i = 0; i < s.length(); i++) {
            // Increment the count of the character in map1 for string s.
            map1[s.charAt(i)] += 1;
            // Increment the count of the character in map2 for string t.
            map2[t.charAt(i)] += 1;
        }

        // After building the frequency maps, check if both strings have the same frequency of characters.
        for(int i = 0; i < s.length(); i++) {
            // If the frequency of a character in string s does not match that in string t, return false.
            if(map1[s.charAt(i)] != map2[s.charAt(i)]) return false;
        }

        // If no mismatch is found, return true, meaning the strings are anagrams.
        return true;
    }
}
