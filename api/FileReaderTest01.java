package kr.co.job.api;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest01 {

	public static void main(String[] args) {
		// 문자스트림
		FileReader reader = null; //읽기
		FileWriter writer = null; //쓰기
		
		String file = "poem.txt"; //파일이 있는 위치
		String fwname = "output.txt"; //쓰기 파일명

		try {
			reader = new FileReader(file);
			writer = new FileWriter(fwname); //쓰기 파일이 생성됨
			
			while (true) {
				try {
					int data = reader.read();
					
					if(data == -1)
						break;
					char ch = (char) data;
					System.out.println(ch);
					
					//파일쓰기
					writer.write(ch);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ioe) {
			
		}
		try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



}
