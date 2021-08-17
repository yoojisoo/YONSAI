/*
 * 컬렉션 프레임 워크
 * List : ArrayList, LinkedList
 */
package kr.co.job.array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest01 {

	public static void main(String[] args) {
		//
		ArrayList<String> list = new ArrayList<String>();
		list.add("딸기");
		list.add("포도");
		list.add("수박");
		list.add("복숭아");
		int num = list.size();
		System.out.println(num);
		
		for (int i = 0; i < num; i++) {
			System.out.println(i + "번째 데이터 : " + list.get(i)); // 인덱스로 가져오는 것
		}

		System.out.println("--------- [ 추 가 ] -----------");
		list.add(2, "메로나"); // 인덱스2 위치에 메로나를 추가합니다. Insert 삽입
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "번째 데이터 : " + list.get(i));
		}

//		첫번째요소(index)의 데이터를 오렌지로 변경
		System.out.println("--------- [ 변 경 ] -----------");
		list.set(0, "오렌지");
		System.out.println("0번째 데이터로 변경하기");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "번째 데이터 : " + list.get(i));
		}

		System.out.println("--------- [ 삭 제 ] -----------");
//		두번쨰요소(index)의 데이터를 삭제
		list.remove(1); // 또는 list.remove("포도") // index로도, data로도 지울 수 있다.
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "번째 데이터 : " + list.get(i));
		}

		System.out.println("--------- [ 검 색 ] -----------");
		int index = list.indexOf("수박");
		System.out.println("찾은 위치 : " + index);
		index = list.lastIndexOf("수박");
		System.out.println("찾은 위치 : " + index);

		System.out.println("--------- [ Iterator ] ---------");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) { //요소 없는 예외를 제외하기 위해 //★★★★ linked에서 많이 사용한다.
			System.out.println(iter.next()); //처음 다음에 데이터가 있다면 출력해라...
		}
		
		System.out.println("--------- [ 향상된 for문 ] ---------");
		for(String str:list) { //많이 쓴당. 인덱스 말고 데이터로만 봤을때~~
			System.out.println(str);
		}
		
		
		
	} // main

}
