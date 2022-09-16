package day14collection3;

public class Ac {
	private String brand;
	private int price;
	private String color;
	private int id;

	public Ac(int id, String brand, String color, int price) {
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.id = id;
	}

	public String toString() {
		return (brand + " " + color + " " + price + " " + id);
	}

	public String getbrand() {
		return brand;
	}

	public int getprice() {
		return price;
	}

	public String getcolor() {
		return color;
	}

	public int getId() {
		return id;

	}

}
