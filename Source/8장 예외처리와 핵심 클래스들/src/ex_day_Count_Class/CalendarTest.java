package ex_day_Count_Class;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class CalendarTest {

	/*
		Date 클래스처럼 날짜 정보를 다루기 위해 설계된 클래스로 Date 클래스보다는
		최신버전이어서 다양한 기능을 제공한다.
		작성일 : 1201
	*/
	public static void main(String[] args) {
		Calendar myCalendar = Calendar.getInstance();
		
		// 값 설정
		myCalendar.set(Calendar.YEAR, 2019);
		myCalendar.set(Calendar.MONTH, 11);
		myCalendar.set(Calendar.DAY_OF_MONTH, 1);
		myCalendar.set(Calendar.HOUR_OF_DAY, 20);
		myCalendar.set(Calendar.MINUTE, 2);
		myCalendar.set(Calendar.SECOND, 3);
		
		// 출력 형식 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
		DateFormat df = DateFormat.getDateInstance();
		Date date = myCalendar.getTime();
		
		// 날짜 출력
		System.out.println(sdf.format(date));
		System.out.println(df.format(date));
	}

}
