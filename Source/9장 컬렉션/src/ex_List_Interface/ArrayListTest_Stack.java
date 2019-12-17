package ex_List_Interface;

import java.util.Stack;

public class ArrayListTest_Stack {
	/*
		Stack의 데이터 저장 구조는 요소를 추가한 방향으로 요소를 추출하는 구조로 마지막에 추가된 요소가 먼저 출력되는 저장구조
		Last In First Out
		작성일 : 1203
	*/
	public static void main(String[] args) {
			Stack<String> stack = new Stack<String>();
			

			stack.push("동산동");
			stack.push("구파발, 연신내, 불광, 녹번");
			stack.push("홍제, 무악재, 독립문");
			stack.push("서대문, 을지로, 명동");
			stack.push("종각, 종로2가");
			stack.push("한남동");
			stack.push("신사, 논현, 강남");
			stack.push("신사, 논현, 강남, 양재, 양재시민의숲");
			stack.push("세곡동");
			
			while(!stack.isEmpty()) {
				System.out.println(stack.pop());
			}
		}
	}
