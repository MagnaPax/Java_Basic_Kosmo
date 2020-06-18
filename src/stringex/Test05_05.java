package stringex;

//Java Programming 이라는 문자열을 생성하고 for문과 if문 등을 사용하여 소문자 r의 갯수를 출력

public class Test05_05 {

	public static void main(String[] args) {

		String str = "Java Programming";
		int numOfChar = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'r')
				numOfChar += 1;
		}

		System.out.println("소문자 'r'의 갯수는: " + numOfChar);

	}

}
