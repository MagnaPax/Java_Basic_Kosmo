package chapter10_interface;

interface Animal_Test03 {
	void sound();
}

class Dog_Test03 implements Animal_Test03 {

	@Override
	public void sound() {
		System.out.println("멍멍!");
	}

}

class Cuckoo_Test03 implements Animal_Test03 {

	@Override
	public void sound() {
		System.out.println("뻐꾹~~");
	}

}

public class Test03 {
	public static void main(String[] args) {

		Dog_Test03 d = new Dog_Test03();
		d.sound();

		Cuckoo_Test03 c = new Cuckoo_Test03();
		c.sound();

		System.out.println();

		makeSound(d);
		Test03.makeSound(c);

	}

	static void makeSound(Animal_Test03 a) {
		a.sound();
	}

}
