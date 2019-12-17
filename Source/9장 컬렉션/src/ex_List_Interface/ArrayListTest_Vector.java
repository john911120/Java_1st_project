package ex_List_Interface;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ArrayListTest_Vector {
	/*
		벡터 클래스는 ArrayList의 구 버전으로 ArrayList와 사용방식은 같다. 차이점이 있다면 컬렉션에 작업을 수행 할 때 vector의 경우
		멀티 스레드 작업이 아니어도 조건없이 동기화가 걸리고 ArrayList의 경우에는 기본적으로 동기화가 적용되지 않고 동기화가 필요한 경우에만
		메소드를 이용해서 동기화 처리를 해준다는 것이 차이점이다. 결론적으로는 ArrayList를 사용하는 것을 권한다. 
		작성일 : 1203
	*/
	public static void main(String[] args) {
		Vector<String> vt = new Vector<String>();
		vt.add("서울");
		vt.add("인천");
		vt.add("부산");
		vt.add("대구");
		vt.add("수원");
		
		for(int i = 0; i < vt.size(); i++) {
			System.out.println("vt.get(" + i + ") =" + vt.get(i));
		}
		System.out.println();
		
		System.out.println("Iterator으로 요소 출력하기");
			Iterator<String> it = vt.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println("Enumeration으로 요소 출력하기");
				Enumeration<String> e = vt.elements();
				while(e.hasMoreElements()) {
					System.out.println(e.nextElement());
				}
			}
	}
