package Class_Type_Ex;

public class Casting_test {
	/*
	 * casting ���� Ŭ���� ����
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
		President president2 = (President)person1;
		
		// person��ü �����ϱ�
		Person person2 = new Person();
		
		// person ��ü�� President Ÿ���� ���۷��� ���� ����
		President president3 = (President)person2;
		
		/*
		// ���� �θ� Ŭ������ ��� �޴� Ŭ���� Ÿ�� ���� ĳ����
		// ������ �θ� Ŭ������ ��� �޾Ƶ� �θ� �ڽ� Ŭ���� ���谡 �ƴ϶�� �ƹ� ���� ���� Ŭ�����̹Ƿ� ��ȣ ĳ���� �Ұ��ϴ�.
		Student student = (Student)president2;
		*/
	}

}
