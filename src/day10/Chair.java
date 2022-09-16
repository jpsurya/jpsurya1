package day10;

public class Chair {
	private int noOfLegs;
	private String material;
	private boolean isRockingChair;

	public Chair(int noOfLegs, String material, boolean isRockingChair) {
		this.noOfLegs = noOfLegs;
		this.material = material;
		this.isRockingChair = isRockingChair;

	}

	public String toString() {
		return ("legs=" + noOfLegs + ", material= " + material + ", isRocking= " + isRockingChair);
	}

}
