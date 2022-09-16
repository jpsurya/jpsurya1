package day15ExeptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ios {
	public static void main(String[] args)throws IOException,FileNotFoundException {
	       try {
	    	   File f=new File("C:\\kabilan files\\jpsurya.txt");
	    	   FileReader fr=new FileReader(f);
	    	   int temp=0;
	    	   while((temp=fr.read())!=-1) {
	    	  System.out.print((char)temp);
	    	   }
	       }catch(Exception e) {
	    	   e.printStackTrace();
	       }

	}
}
