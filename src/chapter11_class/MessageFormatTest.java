package chapter11_class;

import java.text.MessageFormat;

public class MessageFormatTest {

	public static void main(String[] args) {

		String java = "Java";
		int version = 10;
		String s;

		s = MessageFormat.format("language : {1}\nversion : {0}", version, java);
		System.out.println(s);

		System.out.println();

		s = MessageFormat.format("language : {0}\nversion : {1}", version, java);
		System.out.println(s);

		System.out.println();

		Object[] data = { "파란색", "쏘나타" };
		MessageFormat f = new MessageFormat("Color : {1}\nCar : {0}");
		System.out.println(f.format(data));
	}

}
