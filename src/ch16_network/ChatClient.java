package ch16_network;

import java.io.IOException;
import java.net.Socket;

public class ChatClient {
	public static void main(String[] args) {
		 try {
			Socket soc = new Socket("192.168.0.41",9001);
			System.out.println("접속 성공 !!!");
			System.out.println(soc.getRemoteSocketAddress()); // ip and port정보
			String nm = "이름없음";
			if(args.length > 0) {
				nm = args[0];
			}
			// 데이터 송수신
			SendTread send = new SendTread(soc, nm);
			ReceiveThread receive = new ReceiveThread(soc);
			send.start();
			receive.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
