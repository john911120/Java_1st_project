package Ex_Array_;

public class Array_06 {

	/*
	 * �迭 ��ü 2���� 1���� �迭 ��ü���� �����ؼ� �����ϴ� ���α׷�
	 * �ۼ��� : 191111
	 */

	public static void main(String[] args) {
		// System.arraycopy �׽�Ʈ
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
