package stringex;

public class Test09 {

	public static void main(String[] args) {

		Integer x = -3;
		Integer y = -5;
		Double z = 1.0;

		System.out.println("크면(1), 같으면(0), 작으면(-1) 반환해줌");
		System.out.println(x.compareTo(y));
		System.out.println(x.compareTo(-3));
		System.out.println(z.compareTo(2.7));
	}

}
