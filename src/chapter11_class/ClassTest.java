package chapter11_class;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Person person = new Person();

		Class pClass1 = person.getClass(); //Object 의 getClass() 메서드 사용하기
		System.out.println(pClass1.getName());

		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());

		Class pClass3 = Class.forName("chapter11_class.Person");
		System.out.println(pClass3.getName());

	}

}
