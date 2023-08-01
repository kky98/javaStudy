package ch16_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SendTread extends Thread{
	private Socket soc;
	private String name;
	
	public SendTread(Socket soc, String name) {
		super();
		this.soc = soc;
		this.name = name;
	}
	@Override
	public void run() {
		// 키보드 입력을 -> 소켓에 데이터로 전송
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			PrintWriter writer = new PrintWriter(soc.getOutputStream());
			//닉네임 전송
			writer.println(name);
			writer.flush(); // 비우기 
			while(true) {
				System.out.println("입력: ");
				String msg = reader.readLine();
				//채팅 종료
				if(msg == null || msg.equals("")) {
					break;
				}
				writer.println(name + ": " + msg);
				writer.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(soc != null) try {soc.close();} catch(IOException e) {} 
		}
	}
	
}
