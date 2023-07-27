package ch13_thread.Issac;

public class Customer extends Thread{
	private Issac issac = Issac.getInstance();
	private String nm;
	private int cnt;
	public Customer( String nm, int cnt) {
		this.nm = nm;
		this.cnt = cnt;
	}
	@Override
	public void run() {
		issac.buyToast(nm, cnt);
	}
	
}
