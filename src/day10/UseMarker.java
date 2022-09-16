package day10;

public class UseMarker {

	public static void main(String[] args) {
		Marker m1=new Marker();
		m1.setColor("green");
		m1.setprice(10);
        m1.setIsRefilable(false);
        //System.out.println(m1.getColour()+" "+m1.getprice()+" "+m1.getIsRefilable());
       Marker m2=new Marker();
       m2.setColor("black");
       m2.setprice(20);
       m2.setIsRefilable(true);
       //System.out.println(m2.getColour()+" "+m2.getprice()+" "+m2.getIsRefilable());

       Marker m3=new Marker();
       m3.setColor("red");
       m3.setprice(15);
       m3.setIsRefilable(true);
       //System.out.println(m3.getColour()+" "+m3.getprice()+" "+m3.getIsRefilable());
        Marker[] mks= {m1,m2,m3};
        for(int i=0;i<mks.length;i++) {
        	System.out.println(mks[i].getColour()+" "+mks[i].getprice()+" "+mks[i].getIsRefilable());

        }
	}

}
