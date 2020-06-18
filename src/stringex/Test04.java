package stringex;

// 특정 문자열의 위치를 찾는 indexOf(), lastIndexOf()

public class Test04 {

	public static void main(String[] args) {

		String str = "Java 공부 중~!!ㅋㅋ Java 랑 Swift 둘 다 합시다";

		System.out.println("문자열==> " + str);
		System.out.println("제일 처음 나오는 Java 위치==> ");

		// "Java" 글자가 처음 나오는 위치
		System.out.println(str.indexOf("Java"));

		System.out.println("마지막에 Java 나오는 위치==> ");

		// "Java" 글자가 마지막 나오는 위치
		System.out.println(str.lastIndexOf("Java"));

		String str1 = new String("Oracle Java");

		System.out.println("\n원본 문자열: " + str1);

		System.out.println(str1.indexOf('o'));
		System.out.println(str1.indexOf('O'));
		System.out.println(str1.indexOf('k'));
		System.out.println(str1.indexOf('a'));
		System.out.println(str1.indexOf("Java"));
		System.out.println("");

	}

}
