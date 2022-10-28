package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeseralizationExample {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream inStream = new FileInputStream("D:\\Files\\studentData.txt");
		ObjectInputStream in = new ObjectInputStream(inStream);
		Student student = (Student)in.readObject();
		System.out.println(student);
		in.close();
		inStream.close();
		
	}

}
