package filehandling;

import java.io.File;

public class FileInformationExample {
	
public static void main(String[] args) {
	File file = new File("D:\\Files\\myfile.txt");
	if(file.exists()) {
		System.out.println("File exists");
		System.out.println("File Name: " + file.getName());
		System.out.println("Absolute File Path: " + file.getAbsolutePath());
		System.out.println("Is file writable? " + file.canWrite());
		System.out.println("Is file readable? " + file.canRead());
		System.out.println("File Length: " + file.length());
	}
	else
		System.out.println("File doesn't exist.");
}

}
