package ex_String_class;

public class StringTest4 {

	/*
	 	String Ŭ������ �޼ҵ� ���
	 	�ۼ���: 1129
	 */
	
	public static void main(String[] args) {
		String source1 = "aabbccddeeffggaabbccddeeff";
		String source2 = "AAbbccddeeffggaabbccddeeff";
		
		System.out.println("���� ���ڿ�:" + source1);
		System.out.println("ù ��° ����:  + source1.charAt(0): " + source1.charAt(0));
		
		System.out.println("�� ��° ����:  + source1.charAt(3): " + source1.charAt(3));
		
		System.out.println("aaa ���ڿ��� �ε��� : source1.indexOf(\"aaa\") :" + source1.indexOf("aaa"));
		
		System.out.println("aaa ���ڿ��� �ڿ������� �˻��� ��ġ:" + "source1.lastindexOf(\"aaa\"):" + source1.lastIndexOf("aaa"));
		
		System.out.println("3�� �ε��� ���ڷκ��� ������ ���ڱ��� ���: + source1.substring(3):" + source1.substring(3));
		
		System.out.println("3�� �ε��� ���� 5�� �ε������� ���: + source1.substring(3, 6):" + source1.substring(3, 6));
		
		System.out.println("aaa���ڿ��� ggg�� �����ϱ�: + source1.replace(\"aaa\", \"ggg\"):" + source1.replace("aaa", "ggg"));
		
		System.out.println("source1 ���ڿ��� aaa�� ���۵Ǵ��� Ȯ��: + source1.endsWith(\"aaa\"):" + source1.startsWith("aaa"));
		
		System.out.println("source1 ���ڿ��� aaa ���ڿ��� ���ԵǾ� �ִ°��� �Ǵ�: + source1.contains(\"aaa\"):" + source1.contains("aaa"));
		
		System.out.println("source1 ���ڿ��� ����: + source1.length():" + source1.length());
		
		System.out.println("source1�� source2�� ��: + source1.equals(source2):" + source1.equals(source2));
		
		System.out.println("source1�� source2�� ��ҹ��� ������ ��: + source1.equalsignoreCase(source1):" + source1.equalsIgnoreCase(source1));
		
		System.out.println("source2 ��ü�� �빮�ڷ� �����ϱ�: + source2.toUpperCase():" + source2.toUpperCase());
		
		System.out.println("source2 ��ü�� �ҹ��ڷ� �����ϱ�: + source2.toLowerCase():" + source2.toLowerCase());
		
		String source3 = "aaa,bbb,ccc";
		System.out.println("���� ���ڿ�:" + source3);
		String[] splitStr = source3.split(",");
		
		System.out.println("source3.split(\"|\")���� ��ȯ�� �迭 ���");
		
		for(String str: splitStr) {
			System.out.println(str);
		}
		System.out.println();
		
		String source4 = "java";
		System.out.println("���� ���ڿ�:" + source4 + "");
		System.out.println("���� ������ source4 ���ڿ�: source4.trim():" + source4.trim() + "");
		
	}

}
