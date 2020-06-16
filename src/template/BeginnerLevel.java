package template;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("Run slowly.");
	}

	@Override
	public void jump() {
		System.out.println("I can't jump.");
	}

	@Override
	public void turn() {
		System.out.println("I can't turn around.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*** It's beginner level. ***");
	}

}
