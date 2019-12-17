package ex_socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 	UDP방식으로 전송되어 오는 메시지를 수신하고 다시 수신한 메시지를 클라이언트쪽으로 송신하는 예제 코드이다.
 	UDP방식은 비연결적인 통신 방식으로 메시지를 보내는 쪽에서 받는 쪽의 수신을 확인하지 않으며, TCP연결방식에 비해 속도가 빠르다는 큰 장점을 지니지만
 	데이터의 손실에 대한 우려가 있다. 작은 양의 데이터 송신이나 RTS서비스(실시간 스트리밍 서비스)에서 많이 사용된다.
 	작성일 : 1217
 */

public class UDP_Server_Test {
	DatagramSocket dsocket;
	int portNumber;
	
	
	public void receive() {
		try {
			dsocket = new DatagramSocket(8080);
			while(true) {
				byte receiveSize[] = new byte[600];
				DatagramPacket dpacket = new DatagramPacket(receiveSize, receiveSize.length);
				dsocket.receive(dpacket);
				String msg = new String(dpacket.getData());
				System.out.println("클라이언트로부터  메시지 : " + msg);
				InetAddress iadress = dpacket.getAddress();
				dpacket = new DatagramPacket(dpacket.getData(),
						dpacket.getData().length, iadress,portNumber);
				dsocket.send(dpacket);
			}
		} catch(Exception ioe) {
			ioe.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		UDP_Server_Test udpServer = new UDP_Server_Test();
		udpServer.receive();
	}

}
