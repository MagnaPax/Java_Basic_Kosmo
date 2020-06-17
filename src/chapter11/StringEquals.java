package chapter11;

public class StringEquals {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1 == str2); // 물리적으로 같은지
		System.out.println(str1.equals(str2)); // 논리적으로 같은지

		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);

		System.out.println(i1 == i2); // 물리적으로 같은지
		System.out.println(i1.equals(i2)); // 논리적으로 같은지
	}

}
