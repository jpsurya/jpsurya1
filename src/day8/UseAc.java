package day8;

public class UseAc {

	public static void main(String[] args) {
		Ac ac1=new Ac();
		ac1.brand="croma";
		ac1.price=120000;
		ac1.color="blue";
		ac1.is5star=true;
		Ac ac2=new Ac();
		ac2.brand="blustar";
		ac2.price=40000;
		ac2.color="black";
		ac2.is5star=false;
		Ac ac3=new Ac();
		ac3.brand="sony";
		ac3.price=30000;
		ac3.color="blue";
		ac3.is5star=false;
		Ac ac4=new Ac();
		ac4.brand="panasonic";
		ac4.price=50000;
		ac4.color="blue";
		ac4.is5star=true;
		Ac ac5=new Ac();
		ac5.brand="tata";
		ac5.price=12000;
		ac5.color="blue";
		ac5.is5star=false;
      Ac[] acs= {ac1,ac2,ac3,ac4,ac5};
      for(Ac a:acs) {
    	 // System.out.println(a.brand);
    	  if(a.is5star==true) {
    		  System.out.println(a.brand+" "+(a.price-(a.price*8/100))+" "+a.color);
    	  }
      }


	}

}
