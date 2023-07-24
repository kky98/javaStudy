package ch09_class.future;

import java.util.ArrayList;
import java.util.Collections;

public class FutureMain {

	public static void main(String[] args) {
		ArrayList<FutureStudent> stuList = new ArrayList<>();
		stuList.add(new FutureStudent("김규영","Kim GyuYeong" ));
		stuList.add(new FutureStudent("김동현","Kim DongHyun" ));
		stuList.add(new FutureStudent("김상준","Kim SangJun" ));
		stuList.add(new FutureStudent("김성운","Kim SungUn" ));
		stuList.add(new FutureStudent("김세준","Kim SeJun" ));
		stuList.add(new FutureStudent("노윤기","Noh YoonGi" ));
		stuList.add(new FutureStudent("박근혜","Park GeunHye" ));
		stuList.add(new FutureStudent("사원기","Sa WeonGi " ));
		stuList.add(new FutureStudent("송현지","Song HyunJi" ));
		stuList.add(new FutureStudent("신가희","Shin GaHee" ));
		stuList.add(new FutureStudent("예준서","Ye JunSeo" ));
		stuList.add(new FutureStudent("윤가영","Yoon GaYoung" ));
		stuList.add(new FutureStudent("윤서준","Yun SeoJun" ));
		stuList.add(new FutureStudent("이규환","Lee GyuHwan" ));
		stuList.add(new FutureStudent("이상희","Lee SangHee" ));
		stuList.add(new FutureStudent("이영규","Lee YoungGyu" ));
		stuList.add(new FutureStudent("이재우","Lee JaeWoo" ));
		stuList.add(new FutureStudent("이호제","Lee HoJe" ));
		stuList.add(new FutureStudent("임지윤","Lim JiYoon" ));
		stuList.add(new FutureStudent("정민형","Jeong MinHyeong" ));
		stuList.add(new FutureStudent("조하은","Jo HaEun" ));
		stuList.add(new FutureStudent("최민혁","Choi MinHyeock"));
		stuList.add(new FutureStudent("최성웅","Choi SungWoong"));
		//11일이 지났습니다.
		System.out.println("==== 미래융합교육원 교육 시작 !!! ===");
		for(int i = 0; i < 11; i++) {
			System.out.println((i + 1) + "일차 ===================");
			for(FutureStudent stu: stuList) {
				stu.endDay();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Collections.sort(stuList, (stuA, stuB)-> 
						stuB.getLevel() - stuA.getLevel());
		for(int i = 0 ; i < stuList.size(); i ++) {
			System.out.println((i + 1) + "등." + stuList.get(i));
		}
		System.out.println(FutureStudent.getCnt());
	}

}
