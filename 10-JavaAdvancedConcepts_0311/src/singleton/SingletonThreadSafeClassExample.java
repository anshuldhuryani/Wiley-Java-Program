package singleton;

class SingletonClass {
	// Static Variable reference of same class (Type Singleton)
	private static SingletonClass single_instance = null;
	
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
	private SingletonClass() {
		str = "Hello, I am private constructor.";
	}

	// Method that returns single instance of the class.
	public static synchronized SingletonClass getInstance() {
		if(single_instance == null)
			single_instance = new SingletonClass();
		return single_instance;
	}
}

public class SingletonThreadSafeClassExample {

	public static void main(String[] args) {
		
		SingletonClass obj1 = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		SingletonClass obj3 = SingletonClass.getInstance();
		
		System.out.println(obj1.getStr());
		
		// Object Comparison:
		if(obj1 == obj2 && obj2 == obj3) {
			System.out.println("All objects points to the same memory location.");
		} else {
			System.out.println("All objects doesn't point to the same memory location.");
		}
		
		
	}
}
