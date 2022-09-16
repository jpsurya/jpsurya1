package day10;

public class UseMobile {

	public static void main(String[] args) {
		Processor p = new Processor();
	
		p.brand = "SnapDragon";
		p.price = 8000;
		p.antenaScore = 245352;
		Mobile p1 = new Mobile();
		p1.brand = "redmi";
		p1.color = "red";
		p1.price = 9000;
        p1.processor=p;
		System.out.println(p1.brand + " " + p1.price + " " + p1.color + " " + p1.processor.brand+" "+p1.processor.antenaScore);
	}

}
