package stringex;

// 두 문자열이 같은지 확인하는 == <- 메모리까지 비교, equals() <- 의미비교

public class Test10 {

	public static void main(String[] args) {

		String str1 = "Java Programming";
		String str2 = "Java Programming";
		String str3 = new String("Java Programming");

		System.out.println("원본 문자열1 ==>" + str1);
		System.out.println("원본 문자열2 ==>" + str2);
		System.out.println("원본 문자열3 ==>" + str3 + "\n");

		System.out.println("문자열1 == 문자열2 비교 결과: " + (str1 == str2));
		System.out.println("문자열1.equals(문자열2) 비교 결과: " + str1.equals(str2));

		System.out.println("문자열1 == 문자열3 비교 결과: " + (str1 == str3));
		System.out.println("문자열1.equals(문자열3) 비교 결과: " + str1.equals(str3));

	}

}
