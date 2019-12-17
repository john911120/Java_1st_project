package Ex_Array_;

import java.util.Scanner;

public class Array_04 {

	/*
	 * 특정 배열에서 scanner으로 읽어들인 이름이 몇번 인덱스에 있는가를 확인하는 예제 프로그램
	 * 작성일 : 191109 
	 */
	public static void main(String[] args) {
		String names[] = new String[]{"스폰지밥","뚱이","징징이","집게사장","플랭크톤","다람이","캐런"};
		Scanner sc = new Scanner(System.in);
		int index =-1;
		do {
			System.out.println("검색할 이름을 입력하세요");
			System.out.println("이름:");
			String name = sc.next();
			for(int i = 0; i<names.length;i++) {
				if(name.contentEquals(names[i])) {
					index = i;
				}
			}
			if(index != -1) {
				System.out.println(names + "은 배열의" + index + "인덱스 에서 찾았습니다.");
				break;
			}
			System.out.println("해당하는 이름이 존재하지 않습니다.");
			
		}
		while(true);
	}

}
