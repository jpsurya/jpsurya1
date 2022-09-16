package day10;

public class LapTop {
	private String brand;
	private int price;
	private int ram;
	private Batery batery;

	public LapTop(String brand, int price, int ram,Batery batery) {
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		this.batery=batery;

	}
	public String toString() {
		return(brand+" "+price+" "+ram+" "+batery);
	}
}
