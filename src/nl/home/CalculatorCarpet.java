package nl.home;

public class CalculatorCarpet {
	private Floor floor;
	private Carpet carpet;

	public CalculatorCarpet(Floor floor, Carpet carpet) {
		this.floor = floor;
		this.carpet = carpet;
	}

	public double getTotalCost() {
		return (floor.getArea() * carpet.getCost());
	}
}
