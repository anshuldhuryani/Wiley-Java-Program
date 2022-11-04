package multithreading;

class ThreadA extends Thread {
	@Override
	public void run() {
		System.out.println("This is Thread A..");
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread A : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread A is completed.");
	}

}

class ThreadB extends Thread {

	@Override
	public void run() {
		System.out.println("This is Thread B..");
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread B: " + i);
		}
		System.out.println("Thread B is completed.");
	}

}

public class ThreadLifeCycleExample {

	public static void main(String[] args) {

		System.out.println("Main Thread Started..");
		
		// Threads are in new state..
		ThreadA tA = new ThreadA();
		ThreadB tB = new ThreadB();
		
		// Running Thread tA
		tA.start();
		
		tA.yield();
		
		try {
			tA.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Start Thread tB
		tB.start();
		
		System.out.println("Main Thread executing..");
		
		
	}

}
