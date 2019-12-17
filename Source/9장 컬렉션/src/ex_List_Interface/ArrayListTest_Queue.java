package ex_List_Interface;

import java.util.LinkedList;
import java.util.Queue;

public class ArrayListTest_Queue {
	/*
		Queue 한쪽에서 요소를 추가하고 반대 방향으로 요소를 추출하는 형태를 가졌다. 따라서 먼저 추가된 요소가 먼저 추출된다.
		선입선출과 같은 개념이다. 
		작성일 : 1203
	*/
	public static void main(String[] args) {
			Queue<String> queue = new LinkedList<String>();
			

			queue.offer("경기도 고양시");
			queue.offer("은평구");
			queue.offer("서대문구");
			queue.offer("중구");
			queue.offer("종로구");
			queue.offer("용산구");
			queue.offer("강남구");
			queue.offer("서초구");
			queue.offer("강남구");
			
			while(!queue.isEmpty()) {
				System.out.println(queue.poll());
			}
		}
	}
