package nl.home;

public class Carpet {
	private double cost; // price per square meter)

	public Carpet(double cost) {
		if (cost < 0) {
			cost = 0;
		}
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}
}
