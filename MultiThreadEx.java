
public class MultiThreadEx extends Thread{
	public void run() {
		System.out.println("In the thread class");
	}
	public static void main(String args[]) {
		MultiThreadEx th = new MultiThreadEx();
		System.out.println("Before starting the thread");
		th.start();
		System.out.println("Thread is completed");
	}
}
