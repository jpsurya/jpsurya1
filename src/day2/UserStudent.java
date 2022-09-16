package day2;

public class UserStudent {

	public static void main(String[] args) {
		StudentMarks jp = new StudentMarks();
		jp.name = "jayaprakash";
		jp.tamil = 88;
		jp.english = 83;
		jp.maths = 80;
		jp.science = 97;
		jp.social = 95;
		jp.total = jp.tamil + jp.english + jp.maths + jp.science + jp.maths;
		jp.avg = jp.total / 5;
		StudentMarks sam = new StudentMarks();
		sam.name = "sam";
		sam.tamil = 84;
		sam.english = 85;
		sam.maths = 86;
		sam.science = 99;
		sam.social = 98;
		sam.total = sam.tamil + sam.english + sam.maths + sam.science + sam.maths;
		sam.avg = sam.total / 5;
		StudentMarks ram = new StudentMarks();
		ram.name = "ram";
		ram.tamil = 88;
		ram.english = 87;
		ram.maths = 86;
		ram.science = 95;
		ram.social = 92;
		ram.total = ram.tamil + ram.english + ram.maths + ram.science + ram.maths;
		ram.avg = ram.total / 5;
		System.out.println("name= " + jp.name + "  " + "tamil= " + jp.tamil + " " + "english" + jp.english + " "
				+ "science=" + jp.science + "social= " + " " + jp.social + " " + "maths= " + jp.maths + " " + jp.total
				+ " " + jp.avg);
		System.out.println(sam.name + " " + sam.tamil + " " + sam.english + " " + sam.science + " " + sam.social + " "
				+ sam.maths + " " + sam.total + " " + sam.avg);
		System.out.println(ram.name + " " + ram.tamil + " " + ram.english + " " + ram.science + " " + ram.social + " "
				+ ram.maths + " " + ram.total + " " + ram.avg);

	}

}
