package ex_day_Count_Class;

import java.util.Date;

public class DateTest {

	/*
		날짜 관련 클래스 Date 대부분의 기능은 deprecated 되었다.
		가능하면 calendar 클래스를 사용하는 것을 권한다.
		작성일 : 1201
	*/
	public static void main(String[] args) {
		Date date1 = new Date();
		System.out.println("year: " + date1.getYear());
		System.out.println("month: " + date1.getMonth());
		System.out.println("date:" + date1.getDate());
		System.out.println(date1);
	}

}
