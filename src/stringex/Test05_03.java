package stringex;

//concat() 메서드는 해당 문자열의 뒤에 인수로 전달된 문자열을 추가한 새로운 문자열을 반환합니다
//만약 인수로 전달된 문자열의 길이가 0이면 해당 문자열을 그대로 반환합니다.

public class Test05_03 {

	public static void main(String[] args) {

		String str = new String("Java");
		System.out.println("원본 문자열: " + str);
		System.out.println(str.concat("수업"));
		System.out.println("concat()메서드 이후 문자열: " + str);
	}

}
