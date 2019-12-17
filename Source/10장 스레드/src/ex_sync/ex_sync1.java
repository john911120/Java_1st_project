package ex_sync;

	class EasyTicket implements Runnable{
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

		public void getTicket() {
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
		
		


public class ex_sync1 {

	/*
	  	- 동기화 예제(동기화 작업 안한 상태)
	  	동기화를 기차표를 발급하는 예매창구라고 가정하면 잔여 좌석이 1자리 밖에 없는데 여러 스레드에서
	  	동시에 메소드가 적븐해서 예매처리가 기능해지는데 여기서 올바르게 예매처리가 되었다고 볼수 없다.
	  	그래서 필요한게 동기화 즉, 특정 스레드가 작업처리하고 있으면 다른 스레드에서는 해당 메소드에 접근 안되게
	  	하는 기능을 동기화라고 한다. 
	  	작성일 : 1207
	  	
	 */
	
	public static void main(String[] args) {
		EasyTicket et = new EasyTicket();
		Thread et1 = new Thread(et,"TicketConsumer1");
		Thread et2 = new Thread(et,"TicketConsumer2");
		et1.start();
		et2.start();
	}

}
