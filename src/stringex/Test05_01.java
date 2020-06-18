package stringex;

import java.util.Scanner;

public class Test05_01 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String str, strRep, strSub, strAry[];
		System.out.println("8자 이상 문자열을 입력하시기 바랍니다==> ");
		str = s.nextLine();

		System.out.println("입력한 문자열==> " + str);
		strRep = str.replace(" ", "$"); // 입력 문자열의 공백을 $로 바꿈
		strSub = str.substring(3, 8); // 입력 문자열의 3번째 부터 8번째 문자를 추출
		strAry = str.split(" "); // 입력 문자열을 공백으로 분리

		System.out.println("공백을 $로 바꾼 문자열=> " + strRep);
		System.out.println("일부 문자열 표현=> " + strSub);

		for (int i = 0; i < strAry.length; i++)
			System.out.println("분리한 문자열" + i + "==> " + strAry[i]);

		s.close();
	}

}
