package ex_Priority;

	class ImportantThread extends Thread{
		public ImportantThread(String name) {
			super(name);
		}

		@Override
		public void run() {
			for(int i = 1; i <= 15; i++) {
				System.out.println(currentThread().getName());
			}
		}
	}
	
	class NotImportantThread extends Thread{
		public NotImportantThread(String name) {
			super(name);
		}
		@Override
		public void run() {
			for(int i = 1; i <= 15; i++) {
				System.out.println(currentThread().getName());
			}
		}
	}

public class ex_priority1 {

	/* 
	 	- 우선순위를 지정하지 않은 스레드
	 	여러 스레드 가운데에서 가장 중요한 작업을 하는 스레드가 있다면 우선순위를 높게 설정하는 것이다.
	 	작성일 : 1207
	 */
	
	public static void main(String[] args) {
		ImportantThread it = new ImportantThread("중요한 작업");
		NotImportantThread nit = new NotImportantThread("안 중요한 작업");
		nit.start();
		it.start();
	}

}
