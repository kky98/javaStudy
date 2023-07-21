package ch08_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MyList {

	public static void main(String[] args) {
		ArrayList<String> playList = new ArrayList<String>(Arrays.asList("Super Shy:NewJeans",
				"Seven (feat. Latto):Clean Ver.:정국", "퀸카 (Queencard):(여자)아이들", "ETAN:NewJeans", "헤어지자 말해요:박재정",
				"I AM:IVE (아이브)", "이브, 프시케 그리고 푸른 수염의 아내:LE SSERAFIM (르세라핌)", "Spicy:aespa",
				"Steal The Show (From “엘리멘탈”):Lauv", "New Jeans:NewJeans",
				"UNFORGIVEN (feat. Nile Rodgers):LE SSERAFIM (르세라핌)", "Kitsch:IVE (아이브)", "Hype boy:NewJeans",
				"사랑은 늘 도망가:임영웅", "모래 알갱이:임영웅", "Candy:NCT DREAM", "Ditto:NewJeans", "우리들의 블루스:임영웅", "ISTJ:NCT DREAM",
				"다시 만날 수 있을까:임영웅", "Cool With You:NewJeans", "손오공:세븐틴 (SEVENTEEN)", "무지개:임영웅",
				"Broken Melodies:NCT DREAM", "Still With You:정국", "이제 나만 믿어요:임영웅", "London Boy:임영웅", "OMG:NewJeans",
				"Polaroid:임영웅", "아버지:임영웅", "꽃:지수 (JISOO)", "Dynamite:방탄소년단", "Attention:NewJeans", "인생찬가:임영웅",
				"A bientot:임영웅", "손이 참 곱던 그대:임영웅", "사랑해 진짜:임영웅", "사건의 지평선:윤하 (YOUNHA)",
				"I Don't Think That I Like Her:Charlie Puth", "연애편지:임영웅", "After LIKE:IVE (아이브)", "Butter:방탄소년단",
				"Cupid:FIFTY FIFTY", "Take Two:방탄소년단", "Like Crazy:지민", "봄날:방탄소년단", "Dangerously:Charlie Puth",
				"Dreamers [Music from the FIFA World Cup Qatar 2022 Official Soundtrack] (Feat. FIFA Sound):방탄소년단, 정국",
				"LOVE DIVE:IVE (아이브)", "파랑 (Blue Wave):NCT DREAM", "사람 Pt.2 (feat. 아이유):Agust D",
				"파이팅 해야지 (Feat. 이영지):부석순 (SEVENTEEN)", "ASAP:NewJeans", "Permission to Dance:방탄소년단", "보금자리:임영웅",
				"심(心):DK(디셈버)", "Like We Just Met:NCT DREAM", "Teddy Bear:STAYC(스테이씨)", "In Bloom:ZEROBASEONE (제로베이스원)",
				"물론:허각", "사랑하지 않아서 그랬어:임한별", "Yogurt Shake:NCT DREAM", "ANTIFRAGILE:LE SSERAFIM (르세라핌)",
				"Allergy:(여자)아이들", "The Planet:방탄소년단", "건물 사이에 피어난 장미 (Rose Blossom):H1-KEY (하이키)", "사랑인가 봐:멜로망스",
				"너의 모든 순간:성시경", "Cream Soda:EXO", "on the street (with J. Cole):J. Cole, j-hope",
				"Poison (모래성):NCT DREAM", "나에게 그대만이:탑현", "Skateboard:NCT DREAM", "SOS:NCT DREAM",
				"Pretzel (♡):NCT DREAM", "사랑..그게 뭔데:지아", "제자리 걸음 (Starry Night):NCT DREAM", "잠깐 시간 될까:이무진",
				"STAY:Justin Bieber, The Kid LAROI", "Heaven(2023):임재현", "취중고백:김민석 (멜로망스)", "빛이 나는 너에게:던 (DAWN)",
				"That's Hilarious:Charlie Puth", "NIGHT DANCER:imase", "TOMBOY:(여자)아이들", "해요 (2022):#안녕",
				"That’s Not How This Works (feat. Dan + Shay):Charlie Puth", "Get Up:NewJeans", "첫 키스에 내 심장은 120BPM:경서",
				"사실말야내가말야그게그러니까말이야:케이시 (Kassy)", "Summer (Feat. BE’O (비오)):Paul Blanco", "Nxde:(여자)아이들",
				"그중에 그대를 만나:김호중", "Monologue:테이", "다정히 내 이름을 부르면:전건호, 경서", "Thirsty:aespa",
				"잘 지내자, 우리 (여름날 우리 X 로이킴):로이킴", "사랑의 바보:제이세라", "찬란한 하루:멜로망스", "KNOCK:이채연"));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("=================== 나만의 플레이리스트 =====================");
		ArrayList<String> list = singerSet(playList);
		for(int i = 0 ; i < list.size(); i ++) {
			if(i%5==0) {
				System.out.println();
			}
			if(i == list.size()-1) {
				System.out.print(list.get(i));
			}else {
				System.out.print(list.get(i) + ",");
			}
		}
		System.out.println();
		Boolean flag = true;
		HashMap<String, ArrayList<String>> singerMap = new HashMap<>();
		while(flag) {
			System.out.println("---------------------------------------------------------");
			System.out.println("가수를 입력하세요(종료 q)>>>");
			String msg = scanner.nextLine();
			if(msg.equalsIgnoreCase("q")) {
				 flag = false;
			}else {
				singerMap.put(msg, makeSongList(msg, playList));
			}
			
			if(!flag) {
				System.out.println("저장하신 가수는: "+ singerMap.size());
				System.out.println("=========================");
				Set<String> keySet = singerMap.keySet();
				for(String key: keySet) {
					ArrayList<String> music = singerMap.get(key);
					System.out.println("가수명:" + key);
					System.out.println("----------------------");
					for(String str :music) {
						System.out.println("제목:" + str);
					}
					System.out.println("=========================");
				}
				System.out.println("======= 종료 플레이리스트 ========");
			}
		}
	}

	public static ArrayList<String> singerSet(ArrayList<String> arr) {
		HashSet<String> singer = new HashSet<>();
		for (int i = 0; i < arr.size(); i++) {
			String[] temp = arr.get(i).split(":");
			singer.add(temp[1]);
		}
		ArrayList<String> list = new ArrayList<String>();
		for (String str : singer) {
			list.add(str);
		}
		Collections.sort(list);
		return list;
	}

	public static ArrayList<String> makeSongList(String name, ArrayList<String> arr) {
		ArrayList<String> result = new ArrayList<>();
		for (int i = 0; i < arr.size(); i++) {
			String[] temp = arr.get(i).split(":");
// 가수가 같으면 노래 담기
			if (name.equals(temp[1])) {
				result.add(temp[0]);
			}
		}
		return result;
	}

}
