package practice.submit01;

public class Result01 {
	public static void main(String[] args) {
		// Q. 01
		// 본인의 이름과 나이, 키, 연락처, 이메일을 각각 타입에 맞는 변수에 저장한 콘솔창에 출력
		String name = "홍길동";
		int age = 26;
		double height = 177.9;
		String phone = "010-7398-7332";
		String email = "gildong@gmail.com";
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("키: " + height);
		System.out.println("연락처: " + phone);
		System.out.println("이메일: " + email);
		System.out.println("=======================\n");
		// 문자 편집 shift + alt + a A
		// Q. 02
		// 너, 구, 리 를 제거해서 출력해보세요.
		String enigma = "너오구늘리뭐너먹구지리"; 
		enigma = enigma.replace("너","").replace("구", "").replace("리", "");
		System.out.println(enigma);
		// Q. 03
		// 위의 example을 이용해서 2+7+8 = ? 결과를 출력하시오.
		int example = 278;
		String strEx = example + "";
		String str1 = strEx.substring(0,1);
		String str2 = strEx.substring(1,2);
		String str3 = strEx.substring(2,3);
		int result = Integer.parseInt(str1)
				+Integer.parseInt(str2)+Integer.parseInt(str3);
		System.out.println(result);
	}



}
