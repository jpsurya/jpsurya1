package day13HashMap;

public class Player {
	private String name;
	private int age;
	private int runs;
	private int jersynum;
	private String team;
	public Player(String name, int age, int runs, int jersynum,String team) {
		this.name=name;
		this.age=age;
		this.runs=runs;
		this.jersynum=jersynum;
		this.team=team;
	}
	public String toString() {
		return(name+" "+age+" "+runs+" "+jersynum+" "+team);
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setRuns(int runs) {
		this.runs=runs;
	}
	public void setNum(int jersynum) {
		this.jersynum=jersynum;
	}
	public void setTeam(String team) {
		this.team=team;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getRuns() {
		return runs;
	}
	public int getNum() {
		return jersynum;
	}
	public String getTeam() {
		return team;
	}

}
