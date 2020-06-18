package stringex;

//특정 클래스의 main() 메서드 내에서 "Java Programming" 이라는 문자열을 생성하고
//"va"를 추출하여 화면에 출력해 본다

public class Test05_04 {

	public static void main(String[] args) {

		String str = "Java Programming";
		String targetStr = "va";
		int startLocOfStr = str.indexOf(targetStr);

		String res = str.substring(startLocOfStr, startLocOfStr + targetStr.length());
		System.out.println(res);

	}

}
