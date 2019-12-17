package ex_List_Interface;

import java.util.LinkedList;

public class ArrayListTest_LinkedList {
	/*
		LinkedList클래스는 Queue 인터페이스와 List 인터페이스를 구현한 클래스로 LinkedList 클래스에서 List 인터페이스의 기능을 이용하는 방식은
		ArrayList와 비슷하나 데이터를 저장하는 방식이 다르다. 클래스에 저장되는 요소들은 각 요소의 이전 요소와 다음 요소의 주소를 링크하고 있다. 
		작성일 : 1203
	*/
	public static void main(String[] args) {
			LinkedList<String> ll = new LinkedList<String>();
			
			ll.add("갤럭시 s");
			ll.add("갤럭시 노트");
			ll.add("갤럭시 a");
			ll.add("아이폰");
			
			for(int i = 0; i <ll.size();i++) {
				System.out.println(ll.get(i));
			}
		}
	}
