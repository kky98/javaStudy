package ch08_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PlayMap {

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
		
			HashMap<String, ArrayList<String>> singerMap = new HashMap<>();
//		   System.out.println(makeSongList("임영웅", playList));
//		   System.out.println(makeSongList("NewJeans", playList));
		   singerMap.put("임영웅", makeSongList("임영웅", playList));
		   singerMap.put("NewJeans", makeSongList("NewJeans", playList));
		  
		   // 전체 가수들의 노래 리스트를 만들려면? 
		   // 1.가수목록생성 (유니크하게)
		   HashSet<String> singer = new HashSet<>();
		   for(int i = 0 ;i < playList.size(); i++) {
				String [] temp = playList.get(i).split(":");
				singer.add(temp[1]);
		   }
		   System.out.println(singer.size() + ":" +singer);
		   // 2.목록을 순회하며 makeSongList 메서드를 사용하여 map에 담기 
		   for(String sing : singer) {
			   singerMap.put(sing, makeSongList(sing, playList));
		   }
//		   System.out.println(singerMap);
		   Set<String> keySet =singerMap.keySet();
		   for(String key:keySet) {
			   System.out.println(key + ":" + singerMap.get(key));
		   }
		   // 1. 가수 리스트 출력 (가수 이름 정렬하여) 
		   // 2. 가수 이름 입력받기 (q 누를때까지 )
		   // 3. 입력받은 가수만 노래리스트를 출력(Map형태로 담아서)
		   
		   
	}
	// input 가수이름, 전체 리스트
	// output 가수 플레이리스트 
	public static ArrayList<String> makeSongList(
			                  String name, ArrayList<String> arr){
		ArrayList<String> result = new ArrayList<>();
		for(int i = 0 ;i < arr.size(); i++) {
			String [] temp = arr.get(i).split(":");
			// 가수가 같으면 노래 담기
			if(name.equals(temp[1])) {
				result.add(temp[0]);
			}
		}
		return result;
	}
}
