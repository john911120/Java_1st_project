package Class_Ex;

public class Air_ConUsing02 {

	/*
	 * ��ü�� ������ �޼��� ��� �׽�Ʈ
	 * �ۼ��� : 1114
	 * 
	 */
	public static void main(String[] args) {
		Air_Con airCon1 = new Air_Con();
		
		// ���� ���
		airCon1.color = "white";
		airCon1.temp = 10;
		airCon1.price = 1200000;

		//�޼��� ����ϱ�
		airCon1.tempUP();
		System.out.println("airCon1.temp = " + airCon1.temp + ",airCon1.color = " + airCon1.color
				+ ",airCon1.price = " + airCon1.price + "��");
		airCon1.powerOn();
		airCon1.powerOff();
		airCon1.tempDown();
		System.out.println("airCon1.temp = " + airCon1.temp + ",airCon1.color = " + airCon1.color
				+ ",airCon1.price = " + airCon1.price + "��");
		
		// �� �ٸ� ��ü �����ϱ�
		Air_Con airCon2 = new Air_Con();
		System.out.println("airCon2.temp = " + airCon2.temp + ",airCon2.color = " + airCon2.color
				+ ",airCon2.price = " + airCon2.price + "��");
		
		// airCon2 ������ airCon1 ���� ���� �� �Ҵ��ϱ�
		airCon2 = airCon1;
		System.out.println("airCon2.temp = " + airCon2.temp + ",airCon2.color = " + airCon2.color
				+ ",airCon2.price = " + airCon2.price + "��");
	}

}
