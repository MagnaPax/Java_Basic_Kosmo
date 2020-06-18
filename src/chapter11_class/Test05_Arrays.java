package chapter11_class;

import java.util.Arrays;

public class Test05_Arrays {

	public static void main(String[] args) {

		char[] a1 = { 'J', 'a', 'v', 'a' };
		char[] a2 = Arrays.copyOf(a1, a1.length); //배열 copyOf(배열, 길이): 원본 배열을 길이만큼 복사한다

		System.out.println(a2);

		String[] sa = { "cake", "apple", "doughnut", "banana" };
		print(sa); // print()의 호출

		Arrays.sort(sa); // Arrays.sort() 기능으로 sa 배열을 정렬 표현 
		print(sa);

		System.out.println(Arrays.binarySearch(sa, "banana")); // 정렬된 sa 배열에서 banana 위치값 출력

		Arrays.fill(sa, 2, 4, "기타"); // sa 배열의 2번째 시작위치부터 4번째 끝 전까지 위치값을 "기타"로 지정
		print(sa);

	}

	static void print(Object[] oa) {
		for (Object o : oa)
			System.out.print(o + " ");
		System.out.println();
	}

}
