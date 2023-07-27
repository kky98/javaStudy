package ch13_thread.Issac;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Issac {
	private int toast = 0; // 매장에 있는 토스트 수량 
	// private 생성자 싱글톤을 적용하여 1매장 운영되게 
	private String step ="";
	private Issac() {
	}
	private static Issac instance = new Issac();
	public static Issac getInstance () {
		return instance;
	}
	private final BlockingQueue<String> orderQueue = new LinkedBlockingQueue<>();
	public BlockingQueue<String> getOrderQueue() {
		return orderQueue;
	}
	// 토스트 만들기 (chef) 
	public synchronized void makeToast() {
		toast +=1;
		System.out.println("토스트를 하나 만들었습니다 ^^");
		System.out.println("재고 :" + toast);
		notify(); // 스레드 하나 재실행
//		notifyAll();
	}
	// 토스트 구매 (customer)
	public synchronized void buyToast(String nm, int cnt)  {
//		if(step.equals("")) {
//			step = nm;
//		}
//		if(step.equals(nm)) {
			if(toast < cnt) {
				try {
					wait(); // 토스트 재고가 충분해질때까지 대기 
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				toast -=cnt;
				System.out.println(nm + "에게 토스트를 " +cnt +"개 팔았음.");
				System.out.println("재고 :" + toast);
				step ="";
				return;
			}
//		}
		buyToast(nm, cnt); // 재귀함수 사용 
		
	}
}
