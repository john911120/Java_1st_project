package ex_day_Count_Class;

import java.util.Date;

public class DateTest {

	/*
		��¥ ���� Ŭ���� Date ��κ��� ����� deprecated �Ǿ���.
		�����ϸ� calendar Ŭ������ ����ϴ� ���� ���Ѵ�.
		�ۼ��� : 1201
	*/
	public static void main(String[] args) {
		Date date1 = new Date();
		System.out.println("year: " + date1.getYear());
		System.out.println("month: " + date1.getMonth());
		System.out.println("date:" + date1.getDate());
		System.out.println(date1);
	}

}
