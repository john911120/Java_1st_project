package ex_String_class;

public class StringTest3 {

	/*
	 	StringBuffer Ŭ���� �׽�Ʈ
	 	�ۼ���: 1129
	 */
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java");
		StringBuffer sb2 = sb.append("Oracle DB");
		
		System.out.println("sb == sb2:" + (sb == sb2));
	}

}
