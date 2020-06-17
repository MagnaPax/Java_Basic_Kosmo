package chapter10_interface;

interface Animal_Test01_03 {
	void cry();
}

interface Pet {
	void play();
}

//다중 상속
class Cat_Test01_03 implements Animal_Test01_03, Pet {

	@Override
	public void play() {
		System.out.println("쥐 잡기 놀이하자~");
	}

	@Override
	public void cry() {
		System.out.println("야옹~");
	}

}

//다중 상속
class Dog_Test01_03 implements Animal_Test01_03, Pet {

	@Override
	public void play() {
		System.out.println("산책가자~");
	}

	@Override
	public void cry() {
		System.out.println("멍멍!");
	}

}

public class Test01_03 {

	public static void main(String[] args) {

		Cat_Test01_03 c = new Cat_Test01_03();
		c.play();
		c.cry();

		System.out.println();

		Dog_Test01_03 d = new Dog_Test01_03();
		d.play();
		d.cry();

	}

}
