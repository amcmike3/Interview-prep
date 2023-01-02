package com.mcmichael.concepts.stacksandqueues;


public class Queue<T> {
	

	private Stack<T> forward = new Stack<>();
	private Stack<T> reverse = new Stack<>();
	
	public Queue() {};
	
	public boolean isFull() {
		return forward.isFull() || reverse.isFull();
	}
	public boolean isEmpty() {
		return forward.isEmpty() && reverse.isEmpty();
	}
	
	public void enqueue(T data) throws QueueOverFlowException {
		if (isFull()) {
			throw new QueueOverFlowException();
		}
		
		try {
			if (forward.isEmpty()) {
				while (! reverse.isEmpty()) {
					forward.push(reverse.pop());
				}
			}
			forward.push(data);
			
		} catch (StackOverflowException | StackUnderflowException SE ){
			throw new QueueOverFlowException();
		} 
		
	}
	
	public T dequeue(T data) throws QueUnderflowException {
		if (isEmpty()) {
			throw new QueUnderflowException();
		}
		try {
			if (reverse.isEmpty()) {
				while (! forward.isEmpty()) {
					reverse.push(forward.pop());
				}
			}
			return reverse.pop();
		} catch (StackUnderflowException | StackOverflowException SE) {
			throw new QueUnderflowException();
		}
	}

	

	
}