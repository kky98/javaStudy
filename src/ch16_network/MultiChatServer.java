package ch16_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiChatServer {
	// 접속 클라이언트에게 메세지를 보내기위해 담을 객체
	private ArrayList<Client> clientList = new ArrayList<>();
	public void serverStart() {
		ServerSocket server = null;
		try {
			// 9001포트로 서버 열기
			server = new ServerSocket(9001);
			System.out.println("9001 포트 서버 Start!!");
			while(true) {
				Socket soc = server.accept(); // 클라이언트 요청 대기
				System.out.println("클라이언트 요청 수락!");
				System.out.println(soc.getRemoteSocketAddress());// ip 주소 가져오기
				Client client = new Client(soc);
				client.start();
				clientList.add(client); // 접속 클라이언트 담기
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		MultiChatServer server = new MultiChatServer();
		server.serverStart(); // 서버시작
		
	}
	// 접속 클라이언트에게 메세지를 전해주기 위한 class	
	public class Client extends Thread{
		Socket soc;
		PrintWriter writer;
		String name;
		public Client(Socket soc) {
			this.soc = soc;
			try {
				writer = new PrintWriter(soc.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//접속 클라이언트 모두에게 메세지 전송		
		public void sendAll(String msg) {
			for(int i = 0; i < clientList.size(); i++) {
				clientList.get(i).writer.println(msg);
				clientList.get(i).writer.flush();
			}
		}
		@Override
		public void run() {
			try {
				BufferedReader reader =
						new BufferedReader(new InputStreamReader(soc.getInputStream()));
				name = reader.readLine();
				sendAll(name + "님이 입장하셨습니다.");
				while(true) {
					String msg = reader.readLine();
					if(msg == null || msg.isEmpty()) {
						break;
					}
					sendAll(msg); // 전체에게 입력이 들어오는 메세지 전송
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				sendAll(name+ "님이 퇴장하셨습니다.");
				clientList.remove(this);
				if(soc != null ) try {soc.close();} catch (IOException e) {}
			}
		}
		
	}
	
}
