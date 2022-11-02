package strings;

public class PerformanceTestExample {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		StringBuffer stringBuffer = new StringBuffer("Java");
		for (int i = 0; i < 10000; i++) {
			stringBuffer.append("Fundamentals");
		}
		System.out.println("Performance Test(StringBuffer): " + (System.currentTimeMillis() - startTime));
		
		startTime = System.currentTimeMillis();
		StringBuilder stringBuilder = new StringBuilder("Java");
		for (int i = 0; i < 10000; i++) {
			stringBuilder.append("Fundamentals");
		}
		System.out.println("Performance Test(StringBuilder): " + (System.currentTimeMillis() - startTime));
	}
}
