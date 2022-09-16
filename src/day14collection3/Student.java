package day14collection3;

public class Student {
	private String name;
	private int id;
	private int mark;
	private String branch;

	public Student(String name, int id, String branch, int mark) {
		this.id = id;
		this.name = name;
		this.mark = mark;
		this.branch = branch;
	}

	public String toString() {
		return (id + " " + name + " " + branch + " " + mark);
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getMark() {
		return mark;
	}

	public String getBranch() {
		return branch;
	}

}
