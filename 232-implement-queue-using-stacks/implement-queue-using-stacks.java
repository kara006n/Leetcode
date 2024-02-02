class MyQueue {
    
    
    public MyQueue() {
        
    }
    
    Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();

	private void transfer1() {

		while (!stack1.isEmpty()) {

			stack2.push(stack1.pop());

		}

	}

	private void transfer2() {

		while (!stack2.isEmpty()) {

			stack1.push(stack2.pop());

		}

	}

	public void push(int x) {
		stack1.push(x);
	}

	public int pop() {
		if(!empty()) {
			transfer1();
			
		}
		int c = stack2.pop();
		transfer2();
		return c;
	}

	public int peek() {
		if(!empty()) {
			transfer1();
			
		}
		int c = stack2.peek();
		transfer2();
		return c;
		

	}

	public boolean empty() {
		if(stack1.isEmpty()) {
			return true;
		}
		
		else {
			return false;
		}
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