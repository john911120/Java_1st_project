package Class_Type_Ex;

public class Instance_Of_Test {
	/*
	 * instance of ������ �׽�Ʈ�ϱ�
	 * �ۼ��� : 1124
	 */
	public static void main(String[] args) {
		President president1 = new President();
		
		/*
		 * president1 ��ü�� ���� Ŭ������ PersonŬ���� ���۷��� ������ ����
		 * president1 ��ü�� �ڵ����� personŸ������ upCasting �Ǹ鼭 ������ �ȴ�.
		 */
		Person person1 = president1;
		
		// person1 ���۷��� ������ ���� ���� president Ÿ���� ���۷��� ������ �Ҵ�
		// �θ� Ŭ���� Ÿ���� ���� ���� �ڽ� Ŭ���� Ÿ���� ���� ������ �Ҵ��ϹǷ� ������� ĳ������ �ȴ�.
		if(person1 instanceof President) {
			President president2 = (President) person1;
			System.out.println("person1�� presidentŸ������ ĳ���� �����ߴ�");
		} else
		{
			System.out.println("person1�� ĳ���� �� �� ����.");
		}
		;
		
		// person��ü �����ϱ�
		Person person2 = new Person();
		
		// person ��ü�� President Ÿ���� ���۷��� ���� ����
		if(person2 instanceof President) {
			President president3 = (President) person2;
			System.out.println("person2�� PresidentŸ������ ĳ���� �����ߴ�.");
		} else
		{
			System.out.println("person2�� ĳ���� �� �� ����.");
		}
		
		/*
		// ���� �θ� Ŭ������ ��� �޴� Ŭ���� Ÿ�� ���� ĳ����
		// ������ �θ� Ŭ������ ��� �޾Ƶ� �θ� �ڽ� Ŭ���� ���谡 �ƴ϶�� �ƹ� ���� ���� Ŭ�����̹Ƿ� ��ȣ ĳ���� �Ұ��ϴ�.
		Student student = (Student)president2;
		*/
	}

}
