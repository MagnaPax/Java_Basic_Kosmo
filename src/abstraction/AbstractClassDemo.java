package abstraction;

abstract class Shape {

	double PI = 3.14;

	abstract void draw();

	public double findArea() {
		return 0.0;
	}

}

class Circle extends Shape {

	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	void draw() {
		System.out.println("원을 그립니다");
	}

	public double findArea() {
		return PI * radius * radius;
	}

}

class Ractangle extends Shape {

	int width, height;

	public Ractangle(int width, int height) {
		this.width = width;
		this.height = height;

	}

	@Override
	void draw() {
		System.out.println("사각형을 그립니다");
	}

	@Override
	public double findArea() {
		return width * height;
	}

}

public class AbstractClassDemo {
	public static void main(String[] args) {

		Shape c = new Circle(3);
		c.draw();
		System.out.printf("원의 넓이는: %.1f\n", c.findArea());

		Shape r = new Ractangle(3, 4);
		r.draw();
		System.out.printf("사각형의 넓이는: %.1f\n", r.findArea());

	}
}
