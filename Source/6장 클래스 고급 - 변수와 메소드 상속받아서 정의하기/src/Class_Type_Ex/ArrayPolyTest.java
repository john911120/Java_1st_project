package Class_Type_Ex;

public class ArrayPolyTest {
	/*
	 * �迭�� �������� �׽�Ʈ�ϴ� ����
	 * �ۼ��� : 1124
	 */
	public static void main(String[] args) {
		Person[] pArray = new Person[3];
		pArray[0] = new Employee();
		pArray[1] = new Student();
		pArray[2] = new President();
		
		for(int i = 0; i<pArray.length;i++) {
			pArray[i].showSleepstyle();
		}
	}

}
