import java.util.ArrayList;
import java.util.Arrays;

public class Route {
	public Route(ArrayList<City> Given) {
		setCities(Given);
	}

	public Route(Route other) {
		// constructor for route given an older route
		// basically clones it
		other.cities.stream().forEach(x -> cities.add(x));
	}

	private ArrayList<City> cities = new ArrayList<City>();

	public ArrayList<City> getCities() {
		return cities;
	}

	public void setCities(ArrayList<City> A) {
		this.cities = A;
	}

	public String toString() {
		// converts cities arraylist to array then makes that into a string
		return Arrays.toString(cities.toArray());
	}
}
