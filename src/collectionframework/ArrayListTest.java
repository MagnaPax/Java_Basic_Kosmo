package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

class Person {

	private String name;
	private int age;

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class ArrayListTest {

	public static void main(String[] args) {

		//ArrayList에 Person객체 3개를 저장하고 출력해 봄.
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("song", 10));
		list.add(new Person("kim", 20));
		list.add(new Person("hong", 30));
		/*
				Person abc = new Person();
				list.add(abc.setAge(100)); 
		 */

		for (int i = 0; i < list.size(); i++) {
			Person aa = list.get(i);
			System.out.println("이름: " + aa.getName() + ", 나이: " + aa.getAge());
		}
		System.out.println();

		System.out.println("[Iterator를 이용한 출력]");
		//Iterator: 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화 한 것. iterator 를 이용해 모든데이터를 출력해 봄
		Iterator<Person> it = list.iterator();
		while (it.hasNext()) {
			Person per = it.next();
			System.out.println("이름: " + per.getName() + ", 나이: " + per.getAge());
		}

	}

}
