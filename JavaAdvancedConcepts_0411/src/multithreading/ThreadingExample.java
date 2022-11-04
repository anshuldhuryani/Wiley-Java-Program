package multithreading;

class MyUserClass { 
	public void myMethod() {
		System.out.println("Hi, I am static method from MyUserClass.");
	}
}

class MyUserThread extends MyUserClass implements Runnable {
	@Override
	public void run() {
		System.out.println("Hi, I am run method from MyUserThread.");
	}
}

public class ThreadingExample {
	
	public static void main(String[] args) {
		
		MyUserThread t1 = new MyUserThread();
		t1.myMethod();
		Thread thread1 = new Thread(t1);
		thread1.start();
		
	}

}
