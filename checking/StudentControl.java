/* 학생관리를 제어하는 클래스
 * 1. 초기값  : init()
 * 2. 화면메뉴 : menuView()
 *     // 1.추가 2. 수정 3. 삭제 4. 보기, 99종료
 *      
 * 3. 학생추가 : void addStudent()
 * 4. 학생수정 : updateStudent()
 *    - 1. 이름 2. 나이 3. 학번 4.전공
 * 5. 학번검색 : int searchStudent(학번)
 *             찾으면 index, 못찾으면 index=-1 return
 *   
 * 6. 학생삭제 :  deleteStudent()
 *    => 삭제된 학생을 StudentExpel클래스에서 저장
 *     
 * 7. 학생조회(출력) : studentView()
 *        1. 전체보기 2. 학번검색 3. 삭제정보    
 */
package kr.co.job.checking;

import java.util.ArrayList;

import java.util.Scanner;

public class StudentControl {
	Scanner scan = new Scanner(System.in);
	// 학생정보를 담고있는 리스트
	ArrayList<Student> students = new ArrayList<Student>();
	// 삭제된 정보를 담고있는 클래스의 객체 생성
	StudentExpel del = new StudentExpel();
	Student st = new Student();

	// 초기값
	void init() {
		// Student s = new Student("홍길동","22","1","영어");
		students.add(new Student("김영화", "27", "1", "영어"));
		students.add(new Student("이정자", "25", "2", "국어"));
		students.add(new Student("구권선", "22", "3", "수학"));
		students.add(new Student("유팔달", "28", "4", "영어"));
		students.add(new Student("박행궁", "28", "5", "영어"));

	}

	// 기본메뉴 출력메소드
	String menuView() {
		// init(); 여기아닙니다 큰일납니당~
		System.out.println("1.추가 2.수정 3.삭제 4.보기 5.종료");
		return scan.next(); // 입력된 데이터를 리턴. 공백까지만 입력받음
	}

	// 동작을 구현해보자 studentPlay(menuView())
	void studentPlay(String sel) {
		// "1.추가, 2. 수정, 3.삭제, 4 보기, 기타. 종료"
		switch (sel) {
		case "1": // 학생추가
			addStudent();
			break;
		case "2": // 학생수정
			updateView();
			break;
		case "3": // 학생삭제
			deleteStudent();
			break;
		case "4": // 학생보기
			studentView();
			break;
		case "5": // 종료
			break;
		default: // 예외
			break;

		}

	}// end of void studentPlay(String sel)

	void addStudent() { // 1번 학생추가
		System.out.println("학생 정보를 추가합니다.");
		//Search hakbun
		System.out.print("학생 학번 :");
		String addSnum = scan.next();
		boolean find = false;
		for (int i = 0; i < students.size(); i++) {
			String tmp = students.get(i).getSnum();
			if (tmp.equals(addSnum)) {
				find = true;
				System.out.println("   dededededede----");
				break;
			}
		}
		if (!find) {
			System.out.print("학생 이름 :");
			String addName = scan.next();
			System.out.print("학생 나이 :");
			String addAge = scan.next();
			System.out.print("학생 전공 :");
			String addMajor = scan.next();
			
			students.add(new Student(addName, addAge, addSnum, addMajor));
			int lastvalue = students.size() - 1;
			System.out.println(students.get(lastvalue));			
		}
	}

	// 수정메소드 updateView()안에 검색메소드하고 updateStudent()이용
	void updateView() { // 2번 학생수정
		boolean find = false;
		System.out.print("수정할 학생정보 학번으로 검색 : ");
		String search = scan.next();
		for (int i = 0; i < students.size(); i++) {
			String tmp = students.get(i).getSnum();
			if (tmp.equals(search)) {
				int index = i; // 찾은 배열의 i값 저장
				updateStudent(index);
				find = true;
				break;
			}
		}
		if (!find) {
			System.out.println("입력하신 이름으로 찾을 수 없습니다.");
		}
	}

	// 수정메소드
	boolean updateStudent(int index) {
		System.out.println("1.이름수정 2.나이수정 3.학번수정 4.전공수정");
		int num = scan.nextInt();
		if (num == 1) {
			System.out.print("수정 이름 :");
			String setName = scan.next();
			students.get(index).setName(setName); // get i가져와서 set?
			System.out.println("수정확인 : " + students.get(index));
		} else if (num == 2) {
			System.out.print("수정 나이 :");
			String setAge = scan.next();
			students.get(index).setAge(setAge);
			;
			System.out.println("수정확인 : " + students.get(index));
		} else if (num == 3) {
			System.out.print("수정 학번 :");
			String setSnum = scan.next();
			students.get(index).setSnum(setSnum);
			System.out.println("수정확인 : " + students.get(index));
		} else if (num == 4) {
			System.out.print("수정 전공 :");
			String setMajor = scan.next();
			students.get(index).setMajor(setMajor);
			System.out.println("수정확인 : " + students.get(index));
		} else {
			System.out.println("잘못 입력하였습니다.");
			return false;

		}
		return true;
	}

	// 삭제메소드
	void deleteStudent() {
		System.out.println("삭제할 학생정보 학번으로 검색 : ");
		String search = scan.next();
		for (int i = 0; i < students.size(); i++) {
			String tmp = students.get(i).getSnum();
			if (tmp.equals(search)) {
				del.addDelStudent(students.get(i)); //삭제될 정보 저장 //이걸..
				System.out.println(students.get(i).getName()+"의 정보가 삭제되었습니다.");
				students.remove(i);
				break;
			}
		}

	}

	void studentView() {
		System.out.println("조회를 시작합니다.\n 1.전체조회 2.학번조회 3.삭제데이터조회");
		int choice = scan.nextInt();
		if (choice == 1) { // 전체보기
			for (int i = 0; i < students.size(); i++) {
				System.out.println(students.get(i));
			}
		} else if (choice == 2) { // 학번조회
			boolean find = false;
			System.out.println("학번입력");
			String num = scan.next();
			for (int i = 0; i < students.size(); i++) {
				String tmp = students.get(i).getSnum();
				if (tmp.equals(num)) {
					System.out.println(students.get(i));
					find = true;
					break;
				}
			}
			if (!find)
				System.out.println("입력하신 학번으로 찾을 수 없습니다.");
		} else if (choice == 3) { // 삭제데이터 조회

		} else {
			System.out.println("잘못 입력하였습니다.");
		}

	}

}
