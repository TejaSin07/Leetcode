class Solution {
    public int firstUniqChar(String input) {
        return IntStream.range(0, input.length())
            .filter(i -> input.indexOf(input.charAt(i)) == input.lastIndexOf(input.charAt(i)))
            .findFirst()
            .orElse(-1);
    }
}