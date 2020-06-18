package chapter11_class;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {

		String s = "of the poeple, by the people, for the people";

		// 문자열을 토큰으로 분리하는 데 사용
		StringTokenizer st = new StringTokenizer(s, ",");
		System.out.println(st.countTokens());

		while (st.hasMoreTokens()) {
			System.out.print(st.nextToken()); //다음 토큰을 꺼내온다: 문자열만 분리해서 추출함
		}

	}

}
