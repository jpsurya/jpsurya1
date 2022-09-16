package day12collection;

public class Car {
	private String brand;
	private int price;
	private String color;

	public Car(String brand, int price, String color) {
		this.brand = brand;
		this.color = color;
		this.price = price;

	}

	public String toString() {
		return (brand + " " + price + " " + color);

	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setColor(String Color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;

	}

	public int getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

}
