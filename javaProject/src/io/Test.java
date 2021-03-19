package io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		FileWriter fw = new FileWriter("C:/Temp/file.txt");

		while (true) {
			System.out.println("이름과 전화번호를 입력하세요");
			String data = sc.nextLine();
			
			if (!data.equals("end")) {
				fw.write(data);
				fw.close();
				fw.flush();
			} else
				break;
		}
	}

}
