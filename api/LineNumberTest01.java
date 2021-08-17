package kr.co.job.api;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LineNumberReader reader = null;
		
		try {
			reader = new LineNumberReader(new FileReader("poem.txt"));
			
//			while(true) {
//				String str= reader.readLine(); // 줄단위로 읽기
//				if(str == null) // 파일의 끝이라면
//					break;      //중지
//				int lineNo = reader.getLineNumber(); //행번호 읽어들이기
//			}
			String str=null;
			while((str=reader.readLine())!=null) {
				int lineNo = reader.getLineNumber();
				System.out.print(lineNo+" : ");
				System.out.println(str);
			}
			
		
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException ioe) {
			System.out.println("예외 발생");
		}
		try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
