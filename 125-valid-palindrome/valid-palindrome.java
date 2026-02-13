class Solution {
    public boolean isPalindrome(String s) {
        
        String first = s.chars().filter( a  -> (a >= 'a' && a <= 'z') || (a  >= 'A' && a <= 'Z')  || (a >= '0' && a <='9')).map(Character :: toLowerCase).mapToObj(a -> (char)a).map(String::valueOf).collect(Collectors.joining());

        String reversed = new StringBuilder(first)
                .reverse()
                .toString();

        return first.equals(reversed);
    }
}