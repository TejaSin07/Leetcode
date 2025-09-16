class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        ArrayList<Integer> stack = new ArrayList<>();

        for (int num : nums) {
            stack.add(num);

            // keep merging as long as top 2 elements are non-coprime
            while (stack.size() > 1) {
                int a = stack.get(stack.size() - 2);
                int b = stack.get(stack.size() - 1);
                int g = gcd(a, b);

                if (g > 1) {
                    stack.remove(stack.size() - 1);
                    stack.remove(stack.size() - 1);
                    stack.add(lcm(a, b, g));
                } else {
                    break;
                }
            }
        }

        return stack;
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    private static int lcm(int a, int b, int g) {
        return (int) ((long) a * b / g); // use long to prevent overflow
    }
}
