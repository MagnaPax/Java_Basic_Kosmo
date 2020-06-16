package template;

public class Player {

	private PlayerLevel level; // Player가 가지는 level 변수 선언

	// Player 클래스의 디폴트 생성자. 처음 생성되면 BeginnerLevel로 시작하여 레벨 메시지 출력
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}

	public PlayerLevel getLevel() {
		return level;
	}

	// 레벨 변경 메서드인 upgradeLevel을 선언하고 현재 자신의 level을 매개변수로 받은 level로 변경하고 레벨 메시지를 출력하게
	// 함
	public void upgradeLevel(PlayerLevel level) { // 매개변수 자료형은 모든 레벨로 변환 가능한 PlayerLevel형으로 함
		this.level = level;
		level.showLevelMessage();
	}

	public void play(int count) {
		level.go(count); // PalyerLevel의 템플릿 메서드 go()메서드에 int count값의 매개변수를 대입하여 호출 처리함
	}

}
