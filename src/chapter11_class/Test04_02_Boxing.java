package chapter11_class;

public class Test04_02_Boxing {

	public static void main(String[] args) {

		//double 타입의 값(123.45)을 가지고 Double 타입 파라미터(매개변수)를 받는 메소드를 호출
		printDouble(new Double(123.45));
		printDouble(123.45);

	}

	static void printDouble(Double obj) {
		System.out.println(obj); //객체화 Double obj:123.45 출력됨
	}
}
