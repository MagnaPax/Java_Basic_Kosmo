package collectionframework;

import java.util.Arrays;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {

		String[] names1 = { "사슴", "호랑이", "바다표범", "곰" };

		List<String> list = Arrays.asList(names1);
		list.set(0, "독수리");

		for (String s : list)
			System.out.println(s + " ");

	}

}
