class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>(); // Initialize a stack to keep track of asteroids
        //psitive -> right : negative --> left
        for (int asteroid : asteroids) {
            boolean alive = true; // Flag to check if the current asteroid survives
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) { // Check for collisions with previous asteroids
                if (stack.peek() < -asteroid) { // Current asteroid destroys the top of the stack asteroid
                    stack.pop();
                    continue; // Continue checking for further collisions
                } else if (stack.peek() == -asteroid) { // Both asteroids destroy each other
                    stack.pop();
                }
                alive = false; // Current asteroid is destroyed
                break; // Exit the loop as the current asteroid is destroyed
            }
            if (alive) { // If the current asteroid survives, push it onto the stack
                stack.push(asteroid);
            }
        }
        
        int[] result = new int[stack.size()]; // Prepare the result array with the surviving asteroids
        for (int i = stack.size() - 1; i >= 0; --i) { // Pop elements from the stack to fill the result array
            result[i] = stack.pop();
        }
        
        return result; // Return the array of surviving asteroids
    }
}
