package chapter10_interface;

import chapter10_interface.Controllable;
import chapter10_interface.TV;
import chapter10_interface.Computer;

public class Test02 {

	public static void main(String[] args) {

		Controllable[] controllable = { new TV(), new Computer() };

		for (Controllable c : controllable) {
			c.turnOn();
			c.turnOff();
			c.repair();
		}

		// static 으로 선언되어서 인스턴스를 만들지 않고 곧바로 사용
		Controllable.reset();

	}

}
