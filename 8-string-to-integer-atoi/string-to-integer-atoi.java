class Solution {
    public int myAtoi(String s) {
        // Call the recursive helper function
        return myAtoiHelper(s.trim(), 0, 0, 1);
    }

    private int myAtoiHelper(String s, int index, int result, int sign) {
        // Base case: If we've reached the end of the string, return the result with the correct sign
        if (index >= s.length()) {
            return result * sign;
        }

        char currentChar = s.charAt(index);

        // Handle sign on the first character
        if (index == 0 && (currentChar == '-' || currentChar == '+')) {
            sign = (currentChar == '-') ? -1 : 1;
            return myAtoiHelper(s, index + 1, result, sign);  // Move to the next character
        }

        // If it's not a digit, stop processing
        if (!Character.isDigit(currentChar)) {
            return result * sign;
        }

        // Convert the character to a digit
        int digit = currentChar - '0';

        // Update the result and check for overflow/underflow
        if (result > (Integer.MAX_VALUE - digit) / 10) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        // Update the result and move to the next character
        result = result * 10 + digit;
        return myAtoiHelper(s, index + 1, result, sign);
    }}