package ex_String_class;

public class StringTest2 {

	/*
	 	String Ŭ������ �Һ��� �׽�Ʈ
	 	�ۼ���: 1129
	 */
	
	public static void main(String[] args) {
		String originalString = new String("java");
		String lastString = originalString.concat("Oracle DB");
		
		System.out.println("originalString == lastString:" + (originalString == lastString));
	}

}
