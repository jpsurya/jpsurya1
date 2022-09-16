package day9;

public class Student {
	int StudId;
	String StudName;
	int StudAge;

	public int find1(Student []stu,int StuAge) {
		for (int i = 0; i < stu.length; i++) {
		if(stu[i].StudAge>StuAge) {
			return 1;
		}
		}
		return 0;
		
	}
	
	
	

}
