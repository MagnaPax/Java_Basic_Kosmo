package array;

import java.util.Scanner;

public class ArrayQ1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] koreanScores = new int[5];

		for (int i = 0; i < koreanScores.length; i++) {
			System.out.printf("Enter Korean Score in order %d: ", i + 1);
			koreanScores[i] = scan.nextInt();
		}

		System.out.println("\n[Entered scores]");
		for (int i = 0; i < koreanScores.length; i++) {
			System.out.printf("%d ", koreanScores[i]);
		}

		scan.close();

	}

}
