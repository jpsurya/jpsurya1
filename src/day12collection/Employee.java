package day12collection;

public class Employee {
		private int id;
		private String name;
		private int salary;
		private String designation;
		public Employee(int id,String name,int salary,String designation) {
			this.id=id;
			this.name=name;
			this.salary=salary;
			this.designation=designation;
		}
		public String toString() {
			return(id+" "+name+" "+salary+" "+designation);
		}
		public int getid() {
			return id;
		}
		public String getName() {
			return name;
		}
		public int getSalary() {
			return salary;
		}
		public String getDesignation() {
			return designation;
		}

	}


