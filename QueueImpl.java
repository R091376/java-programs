
public class QueueImpl {
	int[] queArr;
	int capacity;
	int size = 0;
	int front = 0;
	int rear = -1;
	public QueueImpl(int capacity) {
		this.capacity = capacity;
		queArr = new int[capacity];
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(size == capacity) {
			return true;
		}
		return false;
	}
	
	public int peek() {
		System.out.println(queArr[front]+" is the peek value");
		return queArr[front];
	}
	
	public void enque(int data) {
		if(isFull()) {
			System.out.println("Queue is Overflow.");
			return;
		}
		queArr[++rear%capacity] = data;
		size++;
		System.out.println(data +" is inserted");
	}
	public void deque() {
		if(isEmpty()) {
			System.out.println("Queue is underflow. No elements present");
			return;
		}
		int data = queArr[front%capacity];
		front++;
		size--;
		System.out.println(data+" is removed from the array");
	}
	public void displayQueue() {
		System.out.println("In Display Data ::");
		for(int i=0;i<size;i++) {
			System.out.println(queArr[(front+i)%capacity]);
		}
	}
	public static void main(String args[]) {
		QueueImpl q = new QueueImpl(5);
		q.enque(1);
		q.enque(2);
		q.enque(3);
		q.enque(4);
		q.enque(5);
		q.enque(6);
		q.displayQueue();
		q.deque();
		q.deque();
		q.deque();
		q.displayQueue();
		q.peek();
	}
}
