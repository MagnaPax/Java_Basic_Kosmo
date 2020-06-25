package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

// BinaryOperator 인터페이스를 구현한 클래스 정의
class CompareString implements BinaryOperator<String> {

	//	reduce() 메서드가 호출될 때 불리는 메서드, 두 문자열 길이를 비교함
	@Override
	public String apply(String s1, String s2) { // 매개변수 2개와 리턴값 1개를 갖는다
		if (s1.getBytes().length >= s2.getBytes().length)
			return s1;
		else
			return s2;
	}
}

public class ReduceTest {

	public static void main(String[] args) {

		String[] greetings = { "안녕하세요!", "Hello", "Good morning", "반갑습니다" };

		// BinaryOperator 인터페이스를 구현한 클래스를 사용하는 경우
		System.out.println(Arrays.stream(greetings).reduce(" ", (s1, s2) -> {
			if (s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else
				return s2;
		}));

		// 매개변수에 람다식을 직접 쓰는 경우
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
	}

}
