package ex_socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ex_TCPServer extends Thread {

	/*
	  	ServerSocket�� Ŭ���̾�Ʈ ������ �̿��ؼ� Ŭ���̾�Ʈ�� ������ ����ϴ� ����
	  	- Ŭ���̾�Ʈ���� ������ �޽����� ������ �������� �޽����� �����ϰ� Ŭ���̾�Ʈ�� �ٽ� 
	  	�޽����� ������ ����� �����Ѵ�.
	  	- ���� ������ �����ʿ��� ������ ���� Ŭ���̾�Ʈ ������ ��û�� accept�޼ҵ带 ȣ���ؼ� ��ٸ���.
	  	�׸��� Ŭ���̾�Ʈ�κ��� ��û�� ���۵Ǿ� ���� Ŭ���̾�Ʈ�� ��� ������ ���� ��ü�� ���ϵȴ�.
	  	- ������ Ŭ���̾�Ʈ���� ���� �� ȣ��Ʈ�� �����ϴ� �뵵�̴�. ������ ���� getInputStream�޼ҵ带
	  	ȣ���ϸ� ��� ȣ��Ʈ�κ��� �����͸� �о���� �� �ִ� ��Ʈ���� �����. ������ ���� getOutputStream
	  	�޼ҵ带 ȣ���ϸ� ��� ȣ��Ʈ�� �����͸� ����� �� �ִ� ��� ��Ʈ���� �����´�. ����� �ٵǾ��ٸ� close�޼ҵ��
	  	���� �����ȴ�.
	  	
	  	�ۼ��� : 1213
	 */
	private InputStream is;
	private OutputStream os;
	private ServerSocket serverSocket;
	private ObjectInputStream ois;
	ObjectOutputStream oos;
	Socket socket;
	
	@Override
	public void run() {
		try{
			serverSocket = new ServerSocket(5000);
			while(true) {
				System.out.println("��û ���");
				socket = serverSocket.accept();
				System.out.println("������ Ŭ���̾�Ʈ : " + socket.getInetAddress());
				is = socket.getInputStream();
				os = socket.getOutputStream();
				ois = new ObjectInputStream(is);
				oos = new ObjectOutputStream(os);
				String msg = (String)ois.readObject();
				System.out.println("Ŭ���̾�Ʈ���� ���� �޽��� : " + msg);
				String retMsg = "�����κ��� �ǵ��ƿ� �޽��� : " + msg;
				oos.writeObject(retMsg);
				socket.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ex_TCPServer().start();
	}

}
