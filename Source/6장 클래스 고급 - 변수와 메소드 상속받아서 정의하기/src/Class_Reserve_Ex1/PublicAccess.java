package Class_Reserve_Ex1;

public class PublicAccess {

	/*
	 * public 접근 제한자 테스트
	 * 작성일 : 1122
	 */
	public static void main(String[] args) {
		PublicData pd = new PublicData();
		System.out.println("publicVar = " + pd.publicVar);
	}

}
