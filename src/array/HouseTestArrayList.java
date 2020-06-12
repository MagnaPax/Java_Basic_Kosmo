package array;

import java.util.ArrayList;

public class HouseTestArrayList {

	public static void main(String[] args) {

		ArrayList<House> houseArrayList = new ArrayList<House>();

		houseArrayList.add(new House("우리집", "한옥"));
		houseArrayList.add(new House("영희집", "미국"));
		houseArrayList.add(new House("친구1", "중국"));
		houseArrayList.add(new House("친구2", "일본"));
		houseArrayList.add(new House("친구3", "벳남"));

		System.out.println("==Using regular for==");
		for (int i = 0; i < houseArrayList.size(); i++) {
			System.out.println(houseArrayList.get(i).showHouseInfo());
		}

		System.out.println("\n==Using Enhanced for==");
		for (House arrHouse : houseArrayList) {
			System.out.println(arrHouse.showHouseInfo());
		}

	}

}
