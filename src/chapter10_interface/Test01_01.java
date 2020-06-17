package chapter10_interface;

interface Animal {

	// 컴파일 할 때 public abstract 이 자동으로 덧붙여짐.
	void cry();

}

class Cat implements Animal {

	@Override
	public void cry() {
		System.out.println("야옹~");
	}

}

class Dog implements Animal {

	@Override
	public void cry() {
		System.out.println("멍멍!");
	}

}

public class Test01_01 {

	public static void main(String[] args) {

		Cat c = new Cat();
		c.cry();

		Dog d = new Dog();
		d.cry();

	}

}
