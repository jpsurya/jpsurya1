package day11;

public class UseAxisBank extends AxisBank{

	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		System.out.println(a.amount(100000));
		System.out.println("rating="+a.rating(5));
        System.out.println("bank name="+a.name("jpBank"));
        System.out.println("is money safe="+a.isMoneySafe(false));
	}

}
