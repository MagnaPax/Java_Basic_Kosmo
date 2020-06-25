package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {

		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");

		Stream<String> stream = sList.stream(); // 스트림 생성
		stream.forEach(s -> System.out.println(s + " ")); // 배열의 요소를 하나씩 출력
		System.out.println();

		// 위에서 자료가 소모되었기 때문에 
		// 스트림을 새로 생성한 뒤 ==> sList.stream()
		// 정렬하고 ==> sorted()
		// 요소를 하나씩 꺼내어 출력 ==> forEach(s -> System.out.println(s))
		sList.stream().sorted().forEach(s -> System.out.println(s));
		System.out.println();

		sList.stream().map(s -> s.length()).forEach(n -> System.out.println(n + " "));
		System.out.println();

		sList.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.println(s));

	}

}
