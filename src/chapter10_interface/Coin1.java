package chapter10_interface;

interface Coin {
	int PENNY = 1, NICKEL = 5, DIME = 10, QUATER = 25;
}

public class Coin1 {

	public static void main(String[] args) {

		System.out.println("DIME은 " + Coin.DIME + "센트 입니다");

	}

}
