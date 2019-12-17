package ex_stringTokenizer_class;

import java.util.StringTokenizer;

public class StringTokenizer_Test2 {

	/*
		StringTokenizer ""(����)�� �����ڷ� ����� ���
		�ۼ��� : 1201
		
	*/
	public static void main(String[] args) {
		/*
		 * �����̸��� �������� �ξ���.
		 */
		String source1 = "�ѱ� �Ϻ� �̱� �߱� ���þ�";
		StringTokenizer st1 = new StringTokenizer(source1);
		while(st1.hasMoreTokens()) {
			System.out.println("st1 token: " + st1.nextToken());
		}
		System.out.println();
		System.out.println();
		
		/*
		 	","�� �����
		 */
		String source2 = "�ѱ�,�Ϻ�,�̱�,�߱�,���þ�";
		StringTokenizer st2 = new StringTokenizer(source2,",");
		while(st2.hasMoreTokens()) {
			System.out.println("st2 token: " + st2.nextToken());
		}
		System.out.println();
		System.out.println();
		
		StringTokenizer st3 = new StringTokenizer(source2, ",", true);
		while(st3.hasMoreTokens()) {
			System.out.println("st3 token: " + st3.nextToken());
		}
	}

}
