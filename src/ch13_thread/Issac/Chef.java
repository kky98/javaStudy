package ch13_thread.Issac;

public class Chef extends Thread{
	private Issac issac = Issac.getInstance();
	private int cnt;
	public Chef(int count) {
		this.cnt = count;
	}
	@Override
	public void run() {
		for(int i= 0; i < cnt ; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			issac.makeToast(); // 토스트 만들기(주문받은 수량만큼)
		}
	}
	
}
