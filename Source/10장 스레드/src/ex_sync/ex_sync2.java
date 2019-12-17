package ex_sync;

	class DressingRoomThread implements Runnable{
		
		@Override
		public void run() {
			synchronized(this) {
				for(int i = 12; i >= 1; i--) {
					try {
						Thread.sleep(1000);
					}
					catch(InterruptedException e){
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName());
					System.out.println("Dressing 종료" + (i*10) + "초 전..");
				}
				System.out.println(Thread.currentThread().getName() + "dressing 완료");
			}
		}
	}
			
public class ex_sync2 {

	/*
	  	- 동기화 예제(특정 객체에 동기화를 지정한 상태)
	  	손님이 옷을 드레싱 룸에서 갈아 입는 동안은 다른 손님이 못들어오게 동기화 처리하는 예제이다.
	  	작성일 : 1207
	  	
	 */
	
	public static void main(String[] args) {
		DressingRoomThread dr = new DressingRoomThread();
		
		Thread t1 = new Thread(dr,"첫 번째 손님");
		Thread t2 = new Thread(dr,"콩 번째 손님");
		
		t1.start();
		t2.start();
	}

}
