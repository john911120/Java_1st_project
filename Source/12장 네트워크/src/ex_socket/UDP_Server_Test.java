package ex_socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 	UDP������� ���۵Ǿ� ���� �޽����� �����ϰ� �ٽ� ������ �޽����� Ŭ���̾�Ʈ������ �۽��ϴ� ���� �ڵ��̴�.
 	UDP����� �񿬰����� ��� ������� �޽����� ������ �ʿ��� �޴� ���� ������ Ȯ������ ������, TCP�����Ŀ� ���� �ӵ��� �����ٴ� ū ������ ��������
 	�������� �սǿ� ���� ����� �ִ�. ���� ���� ������ �۽��̳� RTS����(�ǽð� ��Ʈ���� ����)���� ���� ���ȴ�.
 	�ۼ��� : 1217
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
				System.out.println("Ŭ���̾�Ʈ�κ���  �޽��� : " + msg);
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
