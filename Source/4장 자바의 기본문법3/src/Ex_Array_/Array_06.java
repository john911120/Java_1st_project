package Ex_Array_;

public class Array_06 {

	/*
	 * 배열 객체 2개를 1개의 배열 객체에서 복사해서 저장하는 프로그램
	 * 작성일 : 191111
	 */

	public static void main(String[] args) {
		// System.arraycopy 테스트
		String guns[] = {"K1","K2","K3","K4","K5","K11","M16A1","USAS12"};
		String guns2[] = {"M1A1","tompson","G36C","G36","AN-94","AK-12","M4A1","HK416"};
		String newArray[] = new String[guns.length+guns2.length];
		
		System.arraycopy(guns, 0, newArray, 0, guns.length);
		System.arraycopy(guns2, 0, newArray, guns.length, guns2.length);
		for(String str:newArray) {
			System.out.println(str);
		}
	}

}
