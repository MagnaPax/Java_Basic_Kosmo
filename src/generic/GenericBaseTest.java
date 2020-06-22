package generic;

public class GenericBaseTest {

	public static void main(String[] args) {

		GenericBase<String, Integer> e1 = new GenericBase<>("김선달", 20);
		GenericBase<String, String> e2 = new GenericBase<>("김선달", "등등");

		System.out.println(e1.getKey() + " " + e1.getValue());
		System.out.println(e2.getKey() + " " + e2.getValue());

	}

}
