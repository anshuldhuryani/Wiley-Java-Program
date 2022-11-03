package singleton;

class Singleton {
	// Static Variable reference of same class (Type Singleton)
	private static Singleton single_instance = null;
	
	// Declaring a String Variable
	private  String str;
	
	// Getter and Setter
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	// Private Constructor to restrict the class instantiation
	private Singleton() {
		str = "Hello, I am private constructor.";
	}

	// Method that returns single instance of the class.
	public static Singleton getInstance() {
		if(single_instance == null)
			single_instance = new Singleton();
		return single_instance;
	}
}

public class SingletonClassExample {

	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		Singleton obj3 = Singleton.getInstance();
		
		System.out.println(obj1.getStr());
		
		// Object Comparison:
		if(obj1 == obj2 && obj2 == obj3) {
			System.out.println("All objects points to the same memory location.");
		} else {
			System.out.println("All objects doesn't point to the same memory location.");
		}
		
		
	}
}
