package chapter11_class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
	public static void main(String[] args) {

		/* ※ 패턴기호(설명)
		      y(연), M(월), w(월 구분 없는 주), W(주), d(일), D(월 구분 없는 일),
		      E(요일), a(오전과 오후), h(시간: 1~12), H(시간: 0~23), k(시간: 1~24),
		      K(시간: 0~11), m(분), s(초), S(밀리초), z(타임존) 
		*/

		Date d = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a z");
		System.out.println(sdf1.format(d));
		// sdf1생성객체를 Date()가 적용된 d 포맷으로 화면 출력함
		// 화면 출력 : 수 2020.03.25 at 08:11:03 오전 KST

		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			d = sdf2.parse("2023-02-28");
		} catch (ParseException e) {
		}

		System.out.println(sdf1.format(d));
		// sdf2 parse()에 의해 지정해서 생성된 d의 포맷으로 화면 출력함
		// 화면 출력 : 화 2023.02.28 at 12:00:00 오전 KST
	}
}