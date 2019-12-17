package ex_day_Count_Class;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class CalendarTest {

	/*
		Date Ŭ����ó�� ��¥ ������ �ٷ�� ���� ����� Ŭ������ Date Ŭ�������ٴ�
		�ֽŹ����̾ �پ��� ����� �����Ѵ�.
		�ۼ��� : 1201
	*/
	public static void main(String[] args) {
		Calendar myCalendar = Calendar.getInstance();
		
		// �� ����
		myCalendar.set(Calendar.YEAR, 2019);
		myCalendar.set(Calendar.MONTH, 11);
		myCalendar.set(Calendar.DAY_OF_MONTH, 1);
		myCalendar.set(Calendar.HOUR_OF_DAY, 20);
		myCalendar.set(Calendar.MINUTE, 2);
		myCalendar.set(Calendar.SECOND, 3);
		
		// ��� ���� ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
		DateFormat df = DateFormat.getDateInstance();
		Date date = myCalendar.getTime();
		
		// ��¥ ���
		System.out.println(sdf.format(date));
		System.out.println(df.format(date));
	}

}
