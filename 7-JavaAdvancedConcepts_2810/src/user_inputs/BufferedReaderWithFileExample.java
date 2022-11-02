package user_inputs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderWithFileExample {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new FileReader("D:\\Files\\myFile.txt"));
		int i ;
		while((i = reader.read())!=-1) {
			System.out.print((char)i);
		}
		reader.close();
		
	}

}
