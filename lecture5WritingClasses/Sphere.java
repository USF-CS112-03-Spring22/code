public class Sphere {
	private double radius;

	public Sphere() {
		radius = 1.0;

	}

	public Sphere(double r) {
		radius = r;
	}

	public double getRadius() {
		return radius;
	}
	
	public double computeVolume() {
		return (4.0/3.0)* Math.PI * Math.pow(radius, 3);
	}

}