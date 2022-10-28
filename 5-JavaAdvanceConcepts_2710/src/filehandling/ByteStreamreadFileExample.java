package filehandling;

import java.io.*;

public class ByteStreamreadFileExample {

	public static void main(String[] args) {

		try (InputStream inStream = new FileInputStream("D:\\Files\\myfile.txt")) {
			try (Reader reader = new InputStreamReader(inStream)) {
				int data = reader.read();
				while (data != -1) {
					System.out.print((char) data);
					data = reader.read();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
