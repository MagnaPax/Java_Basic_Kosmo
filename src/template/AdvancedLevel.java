package template;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("Run fast.");
	}

	@Override
	public void jump() {
		System.out.println("Jump high.");
	}

	@Override
	public void turn() {
		System.out.println("I can't turn around.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*** It's advanced level. ***");
	}

}
