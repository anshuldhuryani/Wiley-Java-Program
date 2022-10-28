package filehandling;

import java.io.*;

/**
 * The Byte streams writes the data into file character-wise based upon unicode econding.
 *  i.e. 16 bits at a time. Thus, this is a much quicker technique as compared to byte stream.
 */

public class CharacterStreamWriteFileExample {
	
	public static void main(String[] args) {
		
		try(Writer writer = new FileWriter("D:\\Files\\myfile.txt")) {
			writer.write("Hello Folks");
			writer.write("Here we writting with character stream.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
