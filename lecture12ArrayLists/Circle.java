public class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public void setRadius(double newRad) {
		radius = newRad;
	}

	public double getRadius() {
		return radius;
	}

	public String toString() {
		return "" + radius;
	}
}