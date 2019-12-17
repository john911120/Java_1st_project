package ex_socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ex_TCPServer extends Thread {

	/*
	  	ServerSocket과 클라이언트 소켓을 이용해서 클라이언트와 서버가 통신하는 에제
	  	- 클라이언트에서 서버로 메시지를 보내면 서버에서 메시지를 수신하고 클라이언트로 다시 
	  	메시지를 보내는 기능을 구현한다.
	  	- 서버 소켓은 서버쪽에서 생성된 다음 클라이언트 소켓의 요청을 accept메소드를 호출해서 기다린다.
	  	그리고 클라이언트로부터 요청이 전송되어 오면 클라이언트와 통신 가능한 소켓 객체가 리턴된다.
	  	- 소켓은 클라이언트에서 서버 쪽 호스트를 연결하는 용도이다. 생성된 다음 getInputStream메소드를
	  	호출하면 상대 호스트로부터 데이터를 읽어들일 수 있는 스트림이 생긴다. 생성된 다음 getOutputStream
	  	메소드를 호출하면 상대 호스트로 데이터를 출력할 수 있는 출력 스트림을 가져온다. 사용이 다되었다면 close메소드로
	  	연결 해제된다.
	  	
	  	작성일 : 1213
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
				System.out.println("요청 대기");
				socket = serverSocket.accept();
				System.out.println("접속한 클라이언트 : " + socket.getInetAddress());
				is = socket.getInputStream();
				os = socket.getOutputStream();
				ois = new ObjectInputStream(is);
				oos = new ObjectOutputStream(os);
				String msg = (String)ois.readObject();
				System.out.println("클라이언트에서 보낸 메시지 : " + msg);
				String retMsg = "서버로부터 되돌아온 메시지 : " + msg;
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
