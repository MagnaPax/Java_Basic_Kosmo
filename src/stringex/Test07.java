package stringex;

public class Test07 {

	public static void main(String[] args) {

		String str = " |한글   ABCD  asdfa|    ";

		String result = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				result += str.substring(i, i + 1);
		}

		System.out.println("원본 문자열==>" + str);
		System.out.println("공백 제거 문자열==>" + result);

	}

}
