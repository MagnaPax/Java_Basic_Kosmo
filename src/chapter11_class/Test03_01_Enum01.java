package chapter11_class;

enum Rainbow {
	RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

public class Test03_01_Enum01 {

	public static void main(String[] args) {

		Rainbow[] arr = Rainbow.values();

		for (Rainbow rb : arr) {
			System.out.println(rb);
		}

		System.out.println();

		Rainbow rb1 = Rainbow.valueOf("GREEN");
		System.out.println(rb1);

		System.out.println("\n== ordinal() 메서드 사용 ==");

		int idx = Rainbow.YELLOW.ordinal();
		System.out.println(idx);

	}

}
