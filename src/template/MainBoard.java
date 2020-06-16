package template;

public class MainBoard {

	public static void main(String[] args) {

		// 처음 Player() 생성자를 생성하면 BeginnerLevel로 시작함
		Player player = new Player();
		player.play(1);

		System.out.println();

		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);

		System.out.println();

		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);

	}

}
