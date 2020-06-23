package collectionframework;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {

		Queue<String> q = new LinkedList<>();

		System.out.println(q.poll());

		q.offer("사과");

		System.out.println("바나나를 추가했나요? " + q.offer("바나나"));
		// 특별한 값을 반환: boolean offer(E e) : 바나나
		try {
			q.add("체리");
		} catch (IllegalStateException e) {

		}
		System.out.println("헤드 엿보기: " + q.peek()); // q.peek() : queue에서 특별한 값을 반환 : 검색

		String head = null;
		try {
			head = q.remove(); // queue에서 예외를 던짐: 삭제
			System.out.println("현재 head인 " + head + " 제거하기"); // 사과 제거하기 화면 출력			
		} catch (NoSuchElementException e) {

		}
		head = q.poll(); // queue에서 특별한 값을 반환: 삭제
		System.out.println("현재 head인 " + head + " 제거하기"); // 바나나 제거하기 화면 출력			
		System.out.println("새로운 헤드: " + q.peek()); //새로운 헤드: 체리 화면 출력			
		// q.peek() : queue에서 특별한 값을 반환 : 검색
		System.out.println("체리를 포함하고 있나요? " + q.contains("체리"));
		// 체리를 포함하고 있나요? true 화면 출력
		System.out.println("사과를 포함하고 있나요? " + q.contains("사과"));
	}

}
