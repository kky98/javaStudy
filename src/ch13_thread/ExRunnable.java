package ch13_thread;
// (2) 스레드 사용 2번째 방법 Runnable 인터페이스 구현 
public class ExRunnable implements Runnable{
	int num;
	String name;
	public ExRunnable(int num, String name) {
		this.num = num;
		this.name = name;
	}
	@Override
	public void run() {
		for(int i = num; i <= num + 5; i++) {
			System.out.println(this.name + " " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
