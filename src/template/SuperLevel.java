package template;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("Run super fast!");
	}

	@Override
	public void jump() {
		System.out.println("Jump super high!");
	}

	@Override
	public void turn() {
		System.out.println("Turn around");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*** It's super level. ***");
	}

}
