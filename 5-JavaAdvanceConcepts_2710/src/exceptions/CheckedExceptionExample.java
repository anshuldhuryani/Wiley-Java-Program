package exceptions;

import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {

	public static void main(String[] args) throws IOException {
		FileReader file;
		file = new FileReader("D:\\data.txt");
		file.close();
	}

}
