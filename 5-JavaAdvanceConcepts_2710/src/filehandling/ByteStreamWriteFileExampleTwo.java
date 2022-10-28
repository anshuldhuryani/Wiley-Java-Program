package filehandling;

import java.io.*;

/**
 * The Byte streams writes the data into file byte-wise i.e. 8 bits at a time.
 */

public class ByteStreamWriteFileExampleTwo {
	
	public static void main(String[] args) {
		
		try(OutputStream outStream = new FileOutputStream("D:\\Files\\myfile.txt")) {
			try(Writer writer = new OutputStreamWriter(outStream)) {
				writer.write("Hello Everyone!!");
				writer.write("I am writing some content into the file.");
			} catch (IOException e) {
					System.out.println(e.getMessage());
				}
		}  catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
