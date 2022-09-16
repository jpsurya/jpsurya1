package day13HashMap;

public class Car {
	private String brand;
	private int price;
	private String carNo;
	private String color;
	public Car(String brand,int price,String carNo,String color) {
		this.brand=brand;
		this.price=price;
		this.carNo=carNo;
		this.color=color;
		
	}
	public String toString() {
		return(brand+" "+price+" "+carNo+" "+color);
		
	}
	public String getBrand() {
		return brand;
	}
	public String getCarNo() {
		return carNo;
	}
	public String getColor() {
		return color;
	}
	public int getPrice() {
		return price;
	}

}
