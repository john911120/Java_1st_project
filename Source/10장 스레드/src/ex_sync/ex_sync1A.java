package ex_sync;

	class EasyTicket1 implements Runnable{
		int ticketNum = 10; // 잔여 좌석이 10자리 밖에 안남았다.
		
		@Override
		public void run() {
			for(int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e){
					e.printStackTrace();
				}
				getTicket();
			}
		}

		public synchronized void getTicket() {
			ticketNum -= 1;
			if(ticketNum <= 0) {
				System.out.println(Thread.currentThread().getName()+ ",");
				
				System.out.println("잔여 좌석 없음");
				return;
			}
			System.out.println(Thread.currentThread().getName()+ ",");
			
			System.out.println("현재 잔여 좌석은" + ticketNum + "좌석입니다.");
		}
	}
		
		


public class ex_sync1A {

	/*
	  	- 동기화 예제(메소드에 동기화, 동기화 코드 블록를 적용 한 예제)
	  	
	  	작성일 : 1207	  	
	 */
	
	/* 메소드에 동기화하는 기본 형태
	 
	public synchronized void method()
	{
	
	}
	
	*/
	
	
	
	public static void main(String[] args) {
		EasyTicket1 et = new EasyTicket1();
		Thread et1 = new Thread(et,"TicketConsumer1");
		Thread et2 = new Thread(et,"TicketConsumer2");
		et1.start();
		et2.start();
	}

}
