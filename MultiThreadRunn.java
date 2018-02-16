
public class MultiThreadRunn implements Runnable{

	@Override
	public void run() {
		System.out.println("inside the run method");
	}
	public static void main(String args[]) {
		MultiThreadRunn thread = new MultiThreadRunn();
		Thread th = new Thread(thread);
		th.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Before starting the thread");
		th.start();
		
		System.out.println("After the Thread");
	}
	
}
