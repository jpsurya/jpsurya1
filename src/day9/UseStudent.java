package day9;


public class UseStudent {

	public static void main(String[] args) {
		Student stu1=new Student();
		stu1.StudId=2110;
		stu1.StudAge=19;
		stu1.StudName="prakash";
		Student stu2=new Student();
		stu2.StudId=2120;
		stu2.StudAge=2;
		stu2.StudName="kabilan";
		Student[] Students= {stu1,stu2};
		int ans=stu1.find1(Students,20);
		if(ans==1) {
			for (int i = 0; i < Students.length; i++) {
				System.out.println(Students[i].StudName);
			}
		}
		else {
			System.out.println("NO STUDENT ");
		}


	}

}
