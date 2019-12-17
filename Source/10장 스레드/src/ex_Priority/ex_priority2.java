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
	 	- 우선순위를 지정한 스레드
	 	여러 스레드 가운데에서 가장 중요한 작업을 하는 스레드가 있다면 우선순위를 높게 설정하는 것이다.
	 	작성일 : 1207
	 */
	
	public static void main(String[] args) {
		ImportantThread1 it = new ImportantThread1("중요한 작업");
		NotImportantThread1 nit = new NotImportantThread1("안 중요한 작업");
		it.setPriority(Thread.MAX_PRIORITY);
		nit.setPriority(Thread.MIN_PRIORITY);
		nit.start();
		it.start();
	}

}
