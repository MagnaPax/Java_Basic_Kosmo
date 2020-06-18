package stringex;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str;

		System.out.print("문자열을 입력해 주세요==> ");
		str = s.nextLine();

		System.out.print("출력 문자열==> ");

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'o')
				System.out.printf("%c", '$');
			else
				System.out.printf("%c", str.charAt(i));

		}
		s.close();
	}

}
