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
		Thread�� ��ӹ޾Ƽ� �����带 �����
		- �ش� Ŭ���� ��ü�� ������ Ŭ������ �ȴ�. ������ ��ü�� ���� ���� �����带 �����Ϸ��� run�޼ҵ带 �ٷ� ȣ���ϴ� ���� �ƴ϶�
		  ThreadŬ������ ���ǵǾ� �ִ� start��� �޼ҵ带 ȣ���ؾ��Ѵ�. run() �޼ҵ带 ���� �����ϰ� �Ǹ� ������ �����忡�� run()�޼ҵ尡 ����Ǵ°� �ƴ϶�
		   ���� ������� �ϳ��� ������� �۾��� ����Ǿ� ���� ������� �������� �۾��� ���Ѵ�. 
		�ۼ��� : 1206
	*/
	
	public static void main(String[] args) {
		MyThread myThread = new MyThread("myThread1");
		myThread.start();
	}

}
