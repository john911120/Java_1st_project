package Class_Ex;

public class Air_ConUsing {

	/*
	 * 객체의 변수와 메서드 사용 테스트
	 * 작성일 : 1114
	 * 
	 */
	public static void main(String[] args) {
		Air_Con airCon = new Air_Con();
		
		// 변수 사용
		airCon.color = "white";
		airCon.temp = 10;
		airCon.price = 1200000;

		//메서드 사용하기
		airCon.tempUP();
		System.out.println("airCon.temp = " + airCon.temp + ",airCon.color = " + airCon.color
				+ ",airCon.price = " + airCon.price + "원");
		airCon.powerOn();
		airCon.powerOff();
		airCon.tempDown();
		System.out.println("airCon.temp = " + airCon.temp + ",airCon.color = " + airCon.color
				+ ",airCon.price = " + airCon.price + "원");
	}

}
