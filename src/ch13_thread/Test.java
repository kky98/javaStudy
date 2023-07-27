package ch13_thread;

public class Test {
	public static void main(String[] args) {
		 TestAccount account = new TestAccount();
		 Thread t1 = new Thread(()->{
			 account.withdraw(50);
		 });
		 t1.start();
		 Thread t2 = new Thread(()->{
			 account.withdraw(80);
		 });
		 t2.start();
	}
}
