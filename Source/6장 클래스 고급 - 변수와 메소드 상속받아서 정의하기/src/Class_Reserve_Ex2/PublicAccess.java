package Class_Reserve_Ex2;

import Class_Reserve_Ex1.PublicData;

/*
 * 다른 패키지에 존재하는 클래스를 사용하게 되므로 import해줘야한다.
 * 작성일 : 1122
 */
public class PublicAccess {

	public static void main(String[] args) {
		PublicData pd = new PublicData();
		System.out.println("publicdata = " + pd.publicVar);
	}

}
