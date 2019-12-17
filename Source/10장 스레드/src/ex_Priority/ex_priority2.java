package ex_Priority;

	class ImportantThread1 extends Thread{
		public ImportantThread1(String name) {
			super(name);
		}

		@Override
		public void run() {
			for(int i = 1; i <= 15; i++) {
				System.out.println(currentThread().getName());
			}
		}
	}
	
	class NotImportantThread1 extends Thread{
		public NotImportantThread1(String name) {
			super(name);
		}
		@Override
		public void run() {
			for(int i = 1; i <= 15; i++) {
				System.out.println(currentThread().getName());
			}
		}
	}

public class ex_priority2 {

	/* 
	 	- �켱������ ������ ������
	 	���� ������ ������� ���� �߿��� �۾��� �ϴ� �����尡 �ִٸ� �켱������ ���� �����ϴ� ���̴�.
	 	�ۼ��� : 1207
	 */
	
	public static void main(String[] args) {
		ImportantThread1 it = new ImportantThread1("�߿��� �۾�");
		NotImportantThread1 nit = new NotImportantThread1("�� �߿��� �۾�");
		it.setPriority(Thread.MAX_PRIORITY);
		nit.setPriority(Thread.MIN_PRIORITY);
		nit.start();
		it.start();
	}

}
