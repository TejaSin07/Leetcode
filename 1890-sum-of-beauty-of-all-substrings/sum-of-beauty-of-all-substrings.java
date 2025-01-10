class Solution {
    public int beautySum(String s) {
        final int ALPHABET_COUNT = 26; // Total number of lowercase English letters
        final int STRING_LENGTH = s.length();
        final char[] characters = s.toCharArray();

        int[] charFrequency = new int[ALPHABET_COUNT]; // Frequency of each character
        int[] frequencyHistogram = new int[STRING_LENGTH + 1]; // Count of characters at specific frequencies

        int totalBeautySum = 0;

        // Iterate over all possible starting indices
        for (int start = 0; start < STRING_LENGTH; start++) {
            int currentMinFreq = 0;
            int currentMaxFreq = 0;
            Arrays.fill(charFrequency, 0);

            // Iterate over all possible ending indices starting from `start`
            for (int end = start; end < STRING_LENGTH; end++) {
                char currentChar = characters[end];
                int frequency = ++charFrequency[currentChar - 'a']; // Update frequency of current character

                // Update maximum frequency
                if (frequency > currentMaxFreq) {
                    frequencyHistogram[currentMaxFreq = frequency] = 0;
                }
                frequencyHistogram[frequency]++;

                // Update minimum frequency
                if (frequency == 1 || (--frequencyHistogram[frequency - 1] == 0 && frequency - 1 == currentMinFreq)) {
                    currentMinFreq = frequency;
                }

                // Add the beauty of the current substring
                totalBeautySum += (currentMaxFreq - currentMinFreq);
            }
        }

        return totalBeautySum;
    }
}
