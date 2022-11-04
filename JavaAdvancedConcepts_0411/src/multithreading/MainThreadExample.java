package multithreading;

public class MainThreadExample {
	
	public static void main(String[] args) {
		
		Thread thread  = Thread.currentThread();
		
		thread.setName("Main Thread");
		thread.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("t1 thread is running.");
			}
		};
		
		t1.start();
	}

}
