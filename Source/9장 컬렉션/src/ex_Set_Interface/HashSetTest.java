package ex_Set_Interface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	/*
		HashSet 테스트
		HashSet : 저장 영역에 객체 덩어리를 순서 없이 담는 형태로 요소를 저장하는 클래스이다.중복된 데이터는 허용하지 않기 때문에
				  add(object obj)메소드를 이용해 새로운 요소를 추가할 때 동일한 객체가 이미 존재하면 추가는 실패하고 false 반환
		작성일 : 1202
	*/
	
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		if(hs.add("Korea")) {
			System.out.println("첫 번째 korea 추가 성공");
		}
		else {
			System.out.println("첫 번째 korea 추가 실패");
		}
		if(hs.add("Japan")) {
			System.out.println("Japan 추가 성공");
		}
		else {
			System.out.println("Japan 추가 실패");
		}
		if(hs.add("America")) {
			System.out.println("America 추가 성공");
		}
		else {
			System.out.println("America 추가 실패");
		}
		if(hs.add("britain")) {
			System.out.println("britain 추가 성공");
		}
		else {
			System.out.println("britain 추가 실패");
		}
		if(hs.add("Korea")) {
			System.out.println("두 번째 korea 추가 성공");
		}
		else {
			System.out.println("두 번째 korea 추가 실패");
		}
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
