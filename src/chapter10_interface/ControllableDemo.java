package chapter10_interface;

public class ControllableDemo {

	public static void main(String[] args) {

		TV tv = new TV();
		tv.turnOn();
		tv.turnOff();
		tv.repair();

		System.out.println();

		Computer com = new Computer();
		com.turnOn();
		com.turnOff();
		com.repair();

		System.out.println();

		// static 으로 선언 되어서 인스턴스 생성 없이 호출 가능
		Controllable.reset();
	}

}
