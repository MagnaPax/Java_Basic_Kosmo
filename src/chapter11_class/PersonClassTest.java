package chapter11_class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		/*
		// Class 클래스 선언하는 
		// 첫 번째 방법
		Class strClass = Class.forName("chapter11_class.Person");
		// 두 번째 방법
		Class strClass = Person.class;
		 */

		// 세 번째 방법
		Person s = new Person();
		Class strClass = s.getClass();

		// 모든 생성자 가져오기
		System.out.println("===모든 생성자 가져오기===");
		Constructor[] cons = strClass.getConstructors();
		for (Constructor c : cons) {
			System.out.println(c);
		}

		// 모든 멤버 변수(필드) 가져오기
		System.out.println("\n===모든 멤버 변수(필드) 가져오기===");
		Field[] fileds = strClass.getFields();
		for (Field f : fileds) {
			System.out.println(f);
		}

		// 모든 메서드  가져오기
		System.out.println("\n===모든 메서드 가져오기===");
		Method[] methods = strClass.getMethods();
		for (Method m : methods) {
			System.out.println(m);
		}

	}

}
