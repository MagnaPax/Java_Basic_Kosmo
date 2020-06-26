package exception;

public class ArrayExceptionhandling {

	public static void main(String[] args) {

		int[] arr = new int[5];

		try {
			for (int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e); // 예외가 발생하면 catch 블록 수행			
			System.out.println("예외 처리 부분");
		}
		System.out.println("프로그램 종료");

	}

}
