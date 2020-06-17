package inheritance;

class Animal_Test01_04 {

	public void cry() {
		System.out.println("짖기");
	}
}

class Cat_Test01_04 extends Animal_Test01_04 {

	@Override
	public void cry() {
//		super.cry();
		System.out.println("야옹~");
	}
}

class Dog_Test01_04 extends Animal_Test01_04 {

	@Override
	public void cry() {
//		super.cry();
		System.out.println("멍멍!");
	}
}

public class Test01_04 {

	public static void main(String[] args) {

		Cat_Test01_04 c = new Cat_Test01_04();
		c.cry();

	}

}
