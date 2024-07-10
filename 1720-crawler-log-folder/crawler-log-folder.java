class Solution {
    public int minOperations(String[] logs) {
        int steps = 0;
        int i = 0;
        for (i = 0; i < logs.length; i++) {
            if (logs[i].equals("../")) {
                if (steps > 0) {
                    steps--;
                }
            } else if (!logs[i].equals("./")) {
                steps++;
            }
        }
        return steps;
    }
}
