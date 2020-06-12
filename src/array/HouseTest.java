package array;

public class HouseTest {

	public static void main(String[] args) {

		House[] houseArray = new House[5];

		houseArray[0] = new House("우리집", "한옥");
		houseArray[1] = new House("영희집", "미국");
		houseArray[2] = new House("친구1", "중국");
		houseArray[3] = new House("친구2", "일본");
		houseArray[4] = new House("친구3", "벳남");

		System.out.println("==Using regular for==");
		for (int i = 0; i < houseArray.length; i++) {
			System.out.println(houseArray[i].showHouseInfo());
		}

		System.out.println("\n==Using Enhanced for==");
		for (House arr : houseArray) {
			System.out.println(arr.showHouseInfo());
		}

	}

}
