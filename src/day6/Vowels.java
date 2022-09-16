package day6;

public class Vowels {

	public static void main(String[] args) {
		String n="jayaprakashsurya prakashhariharan";
		int count=0;
		for(int i=0;i<n.length();i++) {
			if (n.charAt(i)=='a'||n.charAt(i)=='i'||n.charAt(i)=='o'||n.charAt(i)=='e'||n.charAt(i)=='u') {
				count++;
				//count=count+1;
			}
		}
		System.out.println(count);

	}

	}
