package day9;

public class NetPrice {
	public int netPrice(int price, int tax) {
		return (price + (price * tax / 100));

	}
	public int netPrice() {
		int price=10000;
		int discount=15;
		return(price-(price*discount/100));
	}
}
