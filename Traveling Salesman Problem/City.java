
public class City {
	private String name;
	private double XPOS, YPOS;

	public City(String n, double x, double y) {
		this.name = n;
		this.XPOS = x;
		this.YPOS = y;
	}

	public String getName() {
		return this.name;
	}

	public double getX() {
		return this.XPOS;
	}

	public double getY() {
		return this.YPOS;
	}

	public double distance(City c) {
		double deltaX = c.XPOS - this.XPOS;
		double deltaY = c.YPOS - this.YPOS;
		double distance = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
		return distance;
	}

	public String toString() {
		return getName();
	}
}
