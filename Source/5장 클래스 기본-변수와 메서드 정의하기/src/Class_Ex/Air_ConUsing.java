package Class_Ex;

public class Air_ConUsing {

	/*
	 * ��ü�� ������ �޼��� ��� �׽�Ʈ
	 * �ۼ��� : 1114
	 * 
	 */
	public static void main(String[] args) {
		Air_Con airCon = new Air_Con();
		
		// ���� ���
		airCon.color = "white";
		airCon.temp = 10;
		airCon.price = 1200000;

		//�޼��� ����ϱ�
		airCon.tempUP();
		System.out.println("airCon.temp = " + airCon.temp + ",airCon.color = " + airCon.color
				+ ",airCon.price = " + airCon.price + "��");
		airCon.powerOn();
		airCon.powerOff();
		airCon.tempDown();
		System.out.println("airCon.temp = " + airCon.temp + ",airCon.color = " + airCon.color
				+ ",airCon.price = " + airCon.price + "��");
	}

}
