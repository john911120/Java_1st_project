package Ex_Array_;

public class Array_01 {

	/*
	 * 1���� �迭 ��ü ����� ���� �ʱ�ȭ�ϰ� ������ �������
	 * �ۼ��� : 191109 
	 */
	public static void main(String[] args) {
		// �迭 �����ϱ�
		int ages[];
		String names[];
		
		// �迭 ��ü �����
		ages = new int[3];
		names = new String[3];
		
		// �ʱ�ȭ
		ages[0] = 10;
		ages[1] = 20;
		ages[2] = 30;
		names[0] = "��������";
		names[1] = "¡¡��";
		names[2] = "����";
		
		// �� ����ϱ�
		for(int i = 0; i <3; i++) {
			System.out.println("ages[" + i + "]=" + ages[i]);
			System.out.println("names[" + i + "]=" + names[i]);
		}
	}

}
