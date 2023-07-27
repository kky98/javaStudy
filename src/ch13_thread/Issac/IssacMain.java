package ch13_thread.Issac;

public class IssacMain {
	public static void main(String[] args) {
		 // 여러고객에게 주문을 받았을때 
		 // 순차적으로 토스트를 생성하고 제공하는 내용.
		Customer pangha = new Customer("팽수",2);
		Customer nick = new Customer("nick", 3);
		Customer judy = new Customer("judy", 4);
		
		Chef chef = new Chef(10);
		chef.start();
		pangha.start();
		nick.start();
		judy.start();
	}
}
