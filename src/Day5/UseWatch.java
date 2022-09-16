package Day5;

public class UseWatch {

	public static void main(String[] args) {
		Watch w1=new Watch();
		w1.brand="sonato";
		w1.price=1234;
		w1.tax=32;
		w1.colour="white";
		w1.isSmart=true;
		Watch w2=new Watch();
		w2.brand="titan";
		w2.price=2243;
		w2.tax=300;
		w2.colour="black";
		w2.isSmart=false;
		if (w1.price>w2.price) {
			System.out.println(w1.brand);
			
		}
		else {
			System.out.println(w2 .brand);
		}
		if(w1.isSmart==true) {
			System.out.println(w1.price);
		}
		else {
			System.out.println(w2.price);
		}

	}

}
