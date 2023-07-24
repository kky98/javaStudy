package ch09_class.typing;

public class TypingMain {
	public static void main(String[] args) {
		int num;
		if(args.length > 0) {
			num = Integer.parseInt(args[0]);
		}else {
			num = Dictionary.OPTION_RANDOM_ALPHABET;
		}
		System.out.println(num);
	}
}
