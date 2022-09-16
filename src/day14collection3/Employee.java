package day14collection3;

public class Employee {
	private int id;
	private String name;
	private int age;
	private int salary;
	private String designation;
	private int exp;

	public Employee(int id, String name, int age, String designation, int salary, int exp) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.designation = designation;
		this.exp = exp;
	}

	public String toString() {
		return (id + " " + name + " " + age + " " + salary + " " + designation + " " + exp);

	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;

	}

	public int getAge() {
		return age;

	}

	public int getSalary() {
		return salary;

	}

	public String getDesignation() {
		return designation;

	}

	public int getexp() {
		return exp;

	}
}
