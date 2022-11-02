package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
	
	public static void main(String[] args) throws IOException {
		
		Student student = new Student(101, "Kartik Sharma"); 
		FileOutputStream outStream = new FileOutputStream("D:\\Files\\studentData.txt");
		ObjectOutputStream out = new ObjectOutputStream(outStream);
		out.writeObject(student);
		out.flush();
		out.close();
		outStream.close();
		System.out.println("Student Object Serialized Successfully.");
		
	}

}
