package ex_List_Interface;

import java.util.ArrayList;

public class ArrayListTest_generic {
	/*
		제네릭 기능 타입 체킹이 정확이 이뤄지지 않는 부분을 해결하기위한 기능으로 1.5버전에 추가되었다.
		컬렉션 객체를 만들고 요소를 추가할 수 있다. 우선 제네릭 기능을 이용해서 컬렉션 객체를 생성하면 지정한
		타입으로만 요소를 추가 가능하다. 
		작성일 : 1202
	*/
	public static void main(String[] args) {
		ArrayList <String> array = new ArrayList<String>();
		
		array.add("korea");
		array.add("japan");
		array.add("america");
		array.add("mexico");
		
		System.out.println("ArrayList에 요소 추가하고 출력");
		for(int i = 0; i <array.size(); i++) {
			System.out.println(array.get(i));
		}
		System.out.println();
		System.out.println();
		
		array.remove(0);
		array.remove("mexico");
		
		System.out.println("ArrayList에서 요소 제거 후 출력");
		for(int i = 0; i <array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
}
