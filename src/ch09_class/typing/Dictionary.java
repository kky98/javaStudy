package ch09_class.typing;

import java.util.ArrayList;

public class Dictionary {
	// 전역적으로 사용하는 상수 	
	public static final int OPTION_STUDENT_NAME = 0;
	public static final int OPTION_CODING_WORD = 1;
	public static final int OPTION_RANDOM_ALPHABET =2;
	public static ArrayList<String> makeWordList(int option){
		ArrayList<String> wordList = new ArrayList<String>();
		//option 0:학생목록, 1:코딩용어, 2:랜덤알파벳
		if(option == OPTION_STUDENT_NAME) {
			//Ctrl + shift +y
			// ctrl +shift +x
			wordList.add("kim gyuyeong");
			wordList.add("kim donghyun");
			wordList.add("kim sangjun");
			wordList.add("kim sungun");
			wordList.add("kim sejun");
			wordList.add("noh yoongi");
			wordList.add("park geunhye");
			wordList.add("sa weongi ");
			wordList.add("song hyunji");
			wordList.add("shin gahee");
			wordList.add("ye junseo");
			wordList.add("yoon gayoung");
			wordList.add("yun seojun");
			wordList.add("lee gyuhwan");
			wordList.add("lee sanghee");
			wordList.add("lee younggyu");
			wordList.add("lee jaewoo");
			wordList.add("lee hoje");
			wordList.add("lim jiyoon");
			wordList.add("jeong minhyoung");
			wordList.add("jo haeun");
			wordList.add("choi minhyeock");
			wordList.add("choi sungwoong");
		}else if(option == OPTION_CODING_WORD) {
			wordList.add("Class");
			wordList.add("static");
			wordList.add("while");
			wordList.add("for");
			wordList.add("method");
			wordList.add("public");
			wordList.add("Constructor");
		}else if(option == OPTION_RANDOM_ALPHABET) {
			// 랜덤 알파벳 6자리 
			String [] alphabet = "qwertyuiopasdfghjklzxcvbnm".split("");
			// 10개만 담기 
			for(int i = 0; i < 10;i++) {
				String word = "";
				for(int j = 0 ; j < 6; j++) {
					int randIdx = (int) (Math.random() * alphabet.length);
					word += alphabet[randIdx];
				}
				wordList.add(word);
			}
		}
		return wordList;
	}
}
