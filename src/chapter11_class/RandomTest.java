package chapter11_class;

import java.util.Random;

/*
int nextInt() <- int 타입의 난수 발생
int nextInt(int bound) <- 0~n 사이의 int 타입의 난수 발생 
 */

public class RandomTest {

	public static void main(String[] args) {

		Random r = new Random();

		for (int i = 0; i < 5; i++)
			System.out.print(r.nextInt(100));

	}

}
