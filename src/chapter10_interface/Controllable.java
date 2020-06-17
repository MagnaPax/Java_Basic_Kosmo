package chapter10_interface;

public interface Controllable {

	void turnOn();

	void turnOff();

	default void repair() {
		System.out.println("장비를 수리한다");
	}

	static void reset() {
		System.out.println("장비를 초기화 한다");
	}

}
