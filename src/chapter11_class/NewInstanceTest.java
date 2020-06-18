package chapter11_class;

/*
ClassNotFoundException : 클래스를 찾지 못할 경우 
InstantiationException : 추상클래스 또는 인터페이스를 인스턴스화 하고자 할 때
IllegalAccessException : 클래스 접근을 못할 경우
*/

public class NewInstanceTest {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Person person1 = new Person(); // 생성자로 생성
		System.out.println(person1);

		Class pClass = Class.forName("chapter11_class.Person");
		Person person2 = (Person) pClass.newInstance(); // Class 클래스의 newInstance() 메서드로 생성하기
		System.out.println(person2);

		String className = "chapter11_class.Person";
		Class sClass = Class.forName(className);

		Person person3 = (Person) sClass.newInstance();
		System.out.println(person3);

	}

}
