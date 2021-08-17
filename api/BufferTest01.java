/*문자기반
 * FileReader 클래스, BufferdReader클래스
 * FileWriter 클래스
 */
package kr.co.job.api;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null; // 주 읽기(1)
		BufferedReader br = null; // 보조 읽기(2)

		try {
			fr = new FileReader("poem.txt");
			br = new BufferedReader(fr);

//			br = new BufferedReader(new FileReader("poem.txt"));
			String str = br.readLine();
			System.out.println(str);

			while (true) {
				int data = br.read(); // 하나의 문자읽어들이기
				if (data < 0) {
					break;
				}
				System.out.print((char) data);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("파일을 읽을 수 없습니다.");
		}
		try {
			fr.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
