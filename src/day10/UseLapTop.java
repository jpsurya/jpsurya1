package day10;

public class UseLapTop {

	public static void main(String[] args) {
		Batery b=new Batery(4000,7000);
		Batery b1=new Batery(3000,6000);
		LapTop lap1=new LapTop("dell",40000,4,b);
		LapTop lap2=new LapTop("hp",30000,8,b1);
		System.out.println(lap1+"\n"+lap2);
		

	}

}
