package ex_socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/*
 	�ܼ����κ��� �޽����� �Է� ���� ���� �Է� ���� �޽����� ������ �����ϰ� �������� ������ �޽����� �ٽ� Ŭ���̾�Ʈ
 	�ֿܼ� ������ִ� �ڵ��̴�.(Ŭ���̾�Ʈ ������ �ϴ� Ŭ������ ���⼭ �����Ѵ�.)
 	�ۼ��� : 1217
 */

public class UDP_Server_Test_Client {
	
	
	private void start() {
		try {
			InetAddress iaddress = InetAddress.getByName("localhost");
			DatagramSocket dsocket = new DatagramSocket(8005);
			Scanner sc = new Scanner(System.in);
			
			System.out.print("������ �޽��� : ");
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
