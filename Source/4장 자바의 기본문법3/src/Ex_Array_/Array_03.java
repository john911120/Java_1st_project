package Ex_Array_;

public class Array_03 {

	/*
	 * �迭 ����� ���� �ʱ�ȭ �ϸ鼭 �迭 ��ü�� �����ϴ� ���α׷�
	 * �ۼ��� : 191109 
	 */
	public static void main(String[] args) {
		// �迭 �����ϱ�
		String cities[] = {"����","����","�뱸","�λ�","����","õ��","��õ"};
		String nations[] = {"�ѱ�","�Ϻ�","�߱�","�̱�","���þ�","����","�߽���"};
		
		// �迭 �� ����ϱ�
		for(int i = 0; i<cities.length;i++) {
			System.out.println("cities[" + i + "]=" + cities[i]);
		}
		for(int i = 0; i <nations.length; i++) {
			System.out.println("nations[" + i + "]=" + nations[i]);
		}
	}

}
