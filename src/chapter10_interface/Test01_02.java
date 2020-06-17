package chapter10_interface;

interface Animal_Test01_02 {
	void cry();
}

interface Cat_Test01_02 extends Animal_Test01_02 {
	void cry();
}

interface Dog_Test01_02 extends Animal_Test01_02 {
	void cry();
}

class MyPet implements Cat_Test01_02, Dog_Test01_02 {
	public void cry() {
		System.out.println("멍멍! 야옹~");
	}
}

public class Test01_02 {
	public static void main(String[] args) {
		MyPet p = new MyPet();
		p.cry();
	}

}
