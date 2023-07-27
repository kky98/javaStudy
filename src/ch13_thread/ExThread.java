package ch13_thread;

//thread 사용 방법 (1) 상속받아서
public class ExThread extends Thread{
	int num;
	public ExThread(int num, String name) {
		super(name);
		this.num = num;
	}
	@Override
	public void run() {
		// 스레드의 기능을 정의하는 부분
		for(int i = num; i <= num + 5; i++) {
			//현재 실행중인 thread 이름 출력
			System.out.println(super.getName() + " " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
