package exception;

// AutoCloseObj 는 내가 만든 클래스.따라서 AutoCloseable 인터페이스를 implements 키워드 사용해서 구현해줘야 됨.
// 그렇게 되면 에러 메세지가 2개 뜸. 이 클래스 자체를 추상화 하든지 구현되지 않은 메소드를 오버라이드 하라고 에러 메세지가 2개 뜸
class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close() 되었습니다");
	}

}

public class AutoCloseTest {

	public static void main(String[] args) {

		try (AutoCloseObj obj = new AutoCloseObj()) {
			throw new Exception(); //강제 예외 발생
		} catch (Exception e) {
			System.out.println("예외 부분입니다");
		}

	}
}