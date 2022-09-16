package day12collection;

import java.util.ArrayList;

public class UseEmployee {

	public static void main(String[] args) {
		Employee emp1=new Employee(564,"jp",50000,"manager");
		Employee emp2=new Employee(565,"jpsurya",60000,"Asistmanager"); 
		Employee emp3=new Employee(566,"prakash",70000,"ceo");
		Employee emp4=new Employee(566,"lokesh",40000,"project manager");
		Employee emp5=new Employee(567,"hari",40000,"zone manager");
		Employee emp6=new Employee(567,"hari",40000,"zone manager");
		//System.out.println(emp1+"\n"+emp2+"\n"+emp3+"\n"+emp4+"\n"+emp5);
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		emp.add(emp5);
		emp.add(emp6);
		System.out.println("*********forloop********");
		for(int i=0;i<emp.size();i++) {
			System.out.println(emp.get(i));
			 
		}
		System.out.println("************enancedLoop********");
		for(Employee empp:emp) {
			System.out.println(empp);
		}
		System.out.println("**************lambda***********");
		emp.forEach((a)-> System.out.println(a));
		
			
		}
	}


