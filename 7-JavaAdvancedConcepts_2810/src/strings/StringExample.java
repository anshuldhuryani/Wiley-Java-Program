package strings;

class StringManipulation {
	public static void stringConcat(String str1) {
		str1 = str1 + "Fundamentals";
	}
	public static void StringBufferConcat(StringBuffer str2) {
		str2.append("Fundamentals");
	}
	public static void StringBuilderConcat(StringBuilder str3) {
		str3.append("Fundamentals");
	}
}

public class StringExample {

	public static void main(String[] args) {
		String str1 = "Java";
		StringManipulation.stringConcat(str1);
		System.out.println(str1);
		
		StringBuffer str2 = new StringBuffer("Java");
		StringManipulation.StringBufferConcat(str2);
		System.out.println(str2);
		
		StringBuilder str3 = new StringBuilder("Java");
		StringManipulation.StringBuilderConcat(str3);
		System.out.println(str3);
	}

}
