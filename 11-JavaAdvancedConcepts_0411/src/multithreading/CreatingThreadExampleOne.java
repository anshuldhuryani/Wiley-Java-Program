package multithreading;

class FirstThread extends Thread {

		@Override
		public void run() {
			System.out.println("First Thread Running..");
		}
}

public class CreatingThreadExampleOne {
	
	public static void main(String[] args) {
		
		FirstThread firstThread = new FirstThread();
		firstThread.start();

		
	}

}
