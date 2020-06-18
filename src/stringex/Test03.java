package stringex;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str;

		System.out.print("문자열을 입력해 주세요==> ");
		str = s.nextLine();

		System.out.print("출력 문자열==> ");

		// 문자열의 시작이 (가 아니면 (를 출력
		if (!str.startsWith("("))
			System.out.printf("(");

		// 입력한 문자를 모두 출력
		for (int i = 0; i < str.length(); i++)
			System.out.printf("%c", str.charAt(i));

		// 문자열의 마지막이 )가 아니면 )를 출력
		if (!str.endsWith(")"))
			System.out.printf(")");

		s.close();
	}

}
