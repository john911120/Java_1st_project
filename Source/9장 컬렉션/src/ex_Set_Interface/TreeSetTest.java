package ex_Set_Interface;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetTest {

	/*
		TreeSet 테스트
		TreeSet : 중복된 데이터는 허용하지 않지만 정렬기능이 추가된 형태이다. 범위 검색 작업에 더 효과적이다. 요소를 추가하면 작은값은 왼쪽
				   큰 값이 오른쪽에서 추가되면서 정렬한다.
		작성일 : 1202
	*/
	
	public static void main(String[] args) {
		TreeSet hs = new TreeSet();
		
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
