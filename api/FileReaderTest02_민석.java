package kr.co.job.api;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderTest02_민석 {

	public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      FileWriter fw = null;//쓰기 관련
	      Scanner sc = new Scanner(System.in);

	      try {
	         fw = new FileWriter("output.txt");
	         System.out.println("종료 입력시 종료됩니다.");
	         while(true) {
	            System.out.println("내용 입력");
	            System.out.print(">>>");
	            String str = sc.nextLine();
	            if(str.equals("종료"))
	               break;
	            fw.write(str+"\n");
	         }
	      }
	      catch(FileNotFoundException fnfe) {
	         fnfe.printStackTrace();
	      }
	      catch(IOException ioe){
	         ioe.printStackTrace();
	      }
	      try {
	         fw.close();
	      }
	      catch(IOException ioe) {
	         ioe.printStackTrace();
	      }
	         
	   }

}
