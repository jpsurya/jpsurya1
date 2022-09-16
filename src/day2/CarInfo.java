package day2;

public class CarInfo {

	public static void main(String[] args) {

		Car mahindra = new Car();
		mahindra.name = "thar";
		mahindra.colour = "black";
		mahindra.price = 800000;
		mahindra.tax = 18;
		mahindra.netprice = 1100000;
		Car toyota = new Car();
		toyota.name = "innova";
		toyota.colour = "red";
		toyota.price = 1200000;
		toyota.tax = 180000;
		toyota.netprice = 140000;
		System.out.println("Car Name : "+ mahindra.name + " " + mahindra.colour + " " + mahindra.price + " " + mahindra.tax + " "
				+ mahindra.netprice);
		System.out.println(
				toyota.name + " " + toyota.colour + " " + toyota.price + " " + toyota.tax + " " + toyota.netprice);
		int total = mahindra.price + toyota.price;
		System.out.println(total);
		int mprice = mahindra.price - mahindra.tax;
		int tprice = toyota.price - toyota.tax;
		System.out.println(mprice + " " + tprice);
		int netprice = mahindra.price + (mahindra.price * mahindra.tax / 100);
		System.out.println(netprice);

	}

}
