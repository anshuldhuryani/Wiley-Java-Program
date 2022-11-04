package multithreading;

class MyDaemonThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Value: " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class DaemonThreadExample {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		Thread childThread = new Thread() {
			public void run() {
				System.out.println("Child Thread Running..");
			}
		};
		
		// main" java.lang.IllegalThreadStateException
		// mainThread.setDaemon(true);
		childThread.setDaemon(true);
		System.out.println(mainThread.isDaemon());
		System.out.println(childThread.isDaemon());
		
		
		MyDaemonThread t1 = new MyDaemonThread();
		Thread thread1 = new Thread(t1);
		thread1.setDaemon(true);
		System.out.println(thread1.isDaemon());
	}
}
