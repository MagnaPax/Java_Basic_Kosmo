package stringex;

public class Test06 {

	public static void main(String[] args) {

		String str = "   |한글 ABCD efgh|   ";
		System.out.println("원본 문자열==> " + str);

		// 소문자->대문자
		System.out.println("대문자로==>" + str.toUpperCase());

		// 대문자 ->소문자
		System.out.println("소문자로==>" + str.toLowerCase());

		// 공백 제거
		System.out.println("앞뒤공백제거==>" + str.trim());

	}

}
