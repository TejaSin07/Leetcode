class MyQueue {
    Stack<Integer> stack;

    public MyQueue() {
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x); // Always push to the top
    }

    public int pop() {
        if (stack.isEmpty()) return -1;

        int x = stack.pop();

        if (stack.isEmpty()) {
            // This is the front of the queue
            return x;
        } 
        else {
            int res = pop(); // Recursively get to the bottom
            //  int res = stack.pop(); why we get wrong ans if we us stack.pop()
            // coz when we call stack.pop() we are just poping the last element of stack
            //but when we are using just pop() we recursivly calling pop() method only.
            stack.push(x);   // Put back the elements as we unwind
            return res;
        }
    }

    public int peek() {
        if (stack.isEmpty()) return -1;

        int x = stack.pop();

        if (stack.isEmpty()) {
            stack.push(x);
            return x;
        } else {
            int res = peek(); // Recursive to get front
            stack.push(x);
            return res;
        }
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}


/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */