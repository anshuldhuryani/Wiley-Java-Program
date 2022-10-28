package filehandling;

import java.io.*;

public class ByteStreamWriteFileExampleOne {
	
	public static void main(String[] args) {
		
		// OutputStream: Writing into the File
		// InputStream: Reading from the File
		OutputStream outStream = null;
		Writer writer = null;
		try {
			outStream = new FileOutputStream("D:\\Files\\myfile.txt");
			writer = new OutputStreamWriter(outStream);
			writer.write("Hello Everyone!!");
			writer.write("I am writing some content into the file.");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				writer.close();
				outStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
