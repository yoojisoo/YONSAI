package kr.co.job.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class Test02Control {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		Test02DAOImpl_2 impl = new Test02DAOImpl_2();
//		Test02DbConn dbConn = new Test02DbConn();

		
		boolean company = true;
		while(company) {
			switch(impl.viewMenu()) {
			case 1 :
				impl.selectAll();				
				break;
			case 2 :
				impl.selectOne();		
				break;
			case 3 :
				impl.insert();
				break;
			case 4 :
				impl.update();			
				break;
			case 5 :
				impl.delete();		
				break;
			case 6 :
				impl.delListView();
				break;
			case 7 :
				System.out.println("Shutting down the system");
				company = false;
				impl.dbclose();
				if(impl.dbclose() == 1) {
					System.out.println("data base close... bye bye~~");
				}
				else {
					System.out.println("No close;;;");					
				}
				break;
			default :
				System.out.println("You've entered something wrong.");			
				break;
				
			}//switch
		}//while
	


	}

}
