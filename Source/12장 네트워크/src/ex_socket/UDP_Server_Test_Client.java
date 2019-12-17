package ex_socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/*
 	콘솔으로부터 메시지를 입력 받은 다음 입력 받은 메시지를 서버로 전송하고 서버에서 수신한 메시지를 다시 클라이언트
 	콘솔에 출력해주는 코드이다.(클라이언트 역할을 하는 클래스를 여기서 정의한다.)
 	작성일 : 1217
 */

public class UDP_Server_Test_Client {
	
	
	private void start() {
		try {
			InetAddress iaddress = InetAddress.getByName("localhost");
			DatagramSocket dsocket = new DatagramSocket(8005);
			Scanner sc = new Scanner(System.in);
			
			System.out.print("전송할 메시지 : ");
			String sendData = sc.next();
			byte[] sendBuffer = sendData.getBytes();
			DatagramPacket dpacket = new DatagramPacket(
					sendBuffer,sendBuffer.length,iaddress,4000);
			dsocket.send(dpacket);
			byte[] receiveBuffer = new byte[600];
			dpacket = new DatagramPacket(receiveBuffer,receiveBuffer.length);
			dsocket.receive(dpacket);
			System.out.println(new String(dpacket.getData()));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		UDP_Server_Test_Client uClient = new UDP_Server_Test_Client();
		uClient.start();
	}

}
