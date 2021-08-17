package kr.co.job.api;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01_1 {

	public static void main(String[] args) {
		FileReader read = null;

		try {
			read = new FileReader("poem.txt");

			while (true) {
				try {
					int data = read.read();
					if (data == -1)
						break;
					char ch = (char) data;
					System.out.println(ch);

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			read.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
