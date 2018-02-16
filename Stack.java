
public class Stack {
	
	int capacity;
	int stack[];
	int top=-1;
	public Stack(int capacity){
		this.capacity = capacity;
		stack = new int[capacity];
	}
	
	public int peek() {
		return stack[top];
	}
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack is full, can't push ::");
			return;
		}
		top++;
		stack[top] = data;
		System.out.println(data+" is pushed into the stack");
	}
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty, can't pop elements");
			return;
		}
		System.out.println(stack[top]+ "is poped from the stack");
		top--;
	}
	public boolean isFull() {
		if(top == capacity-1) {
			return true;
		}
		return false;
	}
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}
	public void displayStackElements() {
		System.out.println("In the display of the stack elements::");
		for(int i=0;i<=top;i++) {
			System.out.println(stack[i]);
		}
	}
	
	public static void main(String args[]) {
		Stack stackObj = new Stack(5);
		stackObj.pop();
		stackObj.push(5);
		stackObj.displayStackElements();
		stackObj.pop();
		stackObj.displayStackElements();
		stackObj.push(5);
		stackObj.push(5);
		stackObj.push(5);
		stackObj.push(5);
		stackObj.push(5);
		stackObj.push(5);
		stackObj.displayStackElements();
	}
}
