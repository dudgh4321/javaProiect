package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:/Temp/file.txt");
		FileWriter fw = new FileWriter("C:/Temp/file1.txt");
		int data = 0;
		char[] readChars = new char[100];
		
		while((data = fr.read(readChars))!= -1) {
			String readLines = new String(readChars);
			System.out.print(new String(readChars));
//			fw.write(new String(readChars));
			fw.write(readLines);
		}
		fw.close();
		fw.flush();
		fr.close();
		System.out.println("end");
		
		
	}

}
