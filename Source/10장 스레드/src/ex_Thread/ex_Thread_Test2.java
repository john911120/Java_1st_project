package ex_Thread;

class MyThread2 implements Runnable{
	
	public void run() {
		for(int i = 1; i <= 20; i++) {
			try 
			{
				System.out.print(Thread.currentThread().getName());
				Thread.sleep(10);
				for (int j = 1; j <= i; j++) {
					System.out.print("$");
				}
				System.out.println();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ex_Thread_Test2 {

	/*
		Runnable 인터페이스를 구현해서 스레드 정의하기
		- run()메소드 하나만 정의되어있다. Runnable 인터페이스를 구현해서 스레드를 정의하려면 run()메서드만 정의해주면 된다.
		   스레드를 구현했을 때는 해당 클래스 자체는 스레드 클래스가 아니다. 단지 스레드가 실행 되었을 때, 처리해야하는 기능만 run()으로 구현한 것 뿐이다.
		   스레드 객체를 만들려면 Thread클래스에서 제공되는 별도의 생성자를 사용해야한다.
		작성일 : 1206
	*/
	
	public static void main(String[] args) {
		MyThread2 myThread2 = new MyThread2();
		Thread thread = new Thread(myThread2,"myThread2");
		thread.start();
	}

}
