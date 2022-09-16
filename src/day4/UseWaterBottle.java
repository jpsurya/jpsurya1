package day4;

public class UseWaterBottle {

	public static void main(String[] args) {
		String[] detail1=args[0].split(",");
		WaterBottle b1=new WaterBottle();
		b1.brand=detail1[0];
		b1.price=Integer.parseInt(detail1[1]);
		b1.material=detail1[2];
		b1.weight=detail1[3];
		String add = b1.brand + b1.weight + b1.material;
		int length=add.length();
		System.out.println("Brand="+b1.brand+", Material="+b1.material+", length="+length);
		
		
		

	}

}
