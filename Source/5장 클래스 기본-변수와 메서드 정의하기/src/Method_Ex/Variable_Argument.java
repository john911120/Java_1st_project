package Method_Ex;

public class Variable_Argument {
	
	/*
	 * �μ� ���� ��� ���� ����3
	 * �ۼ���  : 1115
	 * �ڹٴ� �޼ҵ忡 ���ڸ� ������ ���� ���� ����Ǿ ���۵ȴ�.
	 */
	void printInfo(String ...infos) {
		if(infos.length != 0) {
			for(int i = 0; i<infos.length; i++) {
				System.out.println(infos[i]);
			}
		}
		else {
			System.out.println("���ڰ� �����");
		}
	}
	
	public static void main(String[] args) {
		Variable_Argument vt = new Variable_Argument();
		System.out.println("���� ����");
		vt.printInfo();
		System.out.println("���� 1");
		vt.printInfo("������");
		System.out.println("���� 2");
		vt.printInfo("������","��ȯ�ڽ�");
		System.out.println("���� 3");
		vt.printInfo("������","��ȯ�ڽ�","�ø���");
	}

}
