package ch13_thread;

public class TestAccount {
	private int balance = 100;
	public synchronized void withdraw(int amount) {
		if(balance >= amount) {
			balance = balance - amount;
			System.out.println("인출 완료 현재 잔액:" + balance);
		}else {
			System.out.println("잔액부족");
		}
	}
}

