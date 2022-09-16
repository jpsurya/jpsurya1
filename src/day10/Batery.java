package day10;

public class Batery {
    private	int price1;
	private int mah;
	public  Batery(int price,int mah) {
		this.price1=price;
		this.mah=mah;
	}
	public String toString() {
		return(price1+" "+mah);
	}


}
