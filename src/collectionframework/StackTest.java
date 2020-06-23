package collectionframework;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {

		Stack<String> s1 = new Stack<>();

		s1.push("체리");
		s1.push("바나나");
		s1.push("사과");

		System.out.println("[Stack LIFO 후입선출]");
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());

		Stack<Integer> s2 = new Stack<>();
		// Integer 클래스는 간단한 정수 값을 나타내며 객체는 하나의 int 값을 저장할 수 있습니다.
		s2.add(10);
		s2.add(20);
		s2.add(1, 100);

		System.out.println();

		for (int value : s2)
			System.out.print(value + " ");

		System.out.println();
	}

}
