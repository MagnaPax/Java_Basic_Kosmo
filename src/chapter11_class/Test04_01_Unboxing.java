package chapter11_class;

// 객체 -> 기본형

public class Test04_01_Unboxing {

	public static void main(String[] args) {

		Integer obj = new Integer("10");

		// Integer 객체와 int 타입의 값을 더하는 명령문
		int sum = obj + 20;

		System.out.println(sum);

	}

}
