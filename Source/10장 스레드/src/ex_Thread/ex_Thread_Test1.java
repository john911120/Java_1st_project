package ex_Thread;

class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for(int i = 1; i <= 20; i++) {
			try 
			{
				System.out.print(currentThread().getName());
				sleep(10);
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

public class ex_Thread_Test1 {

	/*
		Thread를 상속받아서 스레드를 만들기
		- 해당 클래스 자체가 스레드 클래스가 된다. 스레드 객체를 만든 다음 스레드를 실행하려면 run메소드를 바로 호출하는 것이 아니라
		  Thread클래스에 정의되어 있는 start라는 메소드를 호출해야한다. run() 메소드를 직접 실행하게 되면 별도의 스레드에서 run()메소드가 실행되는게 아니라
		   원래 스레드와 하나의 스레드로 작업이 실행되어 원래 스레드와 독립적인 작업을 못한다. 
		작성일 : 1206
	*/
	
	public static void main(String[] args) {
		MyThread myThread = new MyThread("myThread1");
		myThread.start();
	}

}
