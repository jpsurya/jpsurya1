package day14collection3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "suryaprakash", 23, "manager", 60000, 2);
		Employee e2 = new Employee(2, "jaya prakash", 25, "ceo", 50000, 8);
		Employee e3 = new Employee(3, "loki", 27, "zone manager", 40000, 3);
		Employee e4 = new Employee(4, "hari", 28, "sales manager", 40000, 4);
		Employee e5 = new Employee(5, "prakash", 24, "assist manager", 50000, 5);
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e1);
		emp.add(e5);
		/*
		 * List<Employee> e = emp.stream().filter(x ->
		 * x.getAge()>24).collect(Collectors.toList()); e.forEach(x ->
		 * System.out.println(x)); System.out.println("**************************");
		 * emp.stream().filter(y->y.getId()>2).forEach(x->System.out.println(x)); int
		 * max=40000; System.out.println("*****************++++++++++");
		 * emp.stream().filter(x->x.getSalary()>max).forEach(z->System.out.println(z));
		 * List<String> a=emp.stream().map(x->x.getName()).collect(Collectors.toList());
		 * for(String c:a) { System.out.println(c); }
		 * emp.stream().map(x->x.getDesignation()).forEach(x->System.out.println(x));
		 * List<String>
		 * v=emp.stream().filter(x->x.getSalary()>40000).map(y->y.getName()).collect(
		 * Collectors.toList()); System.out.println("+++++++++++++++++++++"); for
		 * (String p:v) { System.out.println(p); }
		 * System.out.println("+++++++++++++++++++");
		 * emp.stream().filter(x->x.getSalary()>40000).map(y->y.getName()).forEach(x->
		 * System.out.println(x)); System.out.println("****************AGE***********");
		 * List<Integer>
		 * l=emp.stream().filter(x->x.getDesignation().equalsIgnoreCase("manager")).map(
		 * y->y.getAge()).collect(Collectors.toList()); for(Integer p:l) {
		 * System.out.println(p); }
		 * System.out.println("********************CONTAINS**************");
		 * emp.stream().filter(x->x.getDesignation().contains("manager")).map(y->y.
		 * getAge()).forEach(z->System.out.println(z)); Map<Integer,Employee>
		 * h=emp.stream().collect(Collectors.toMap(Employee::getId,Function.identity()))
		 * ; h.forEach((x,y)->System.out.println(x+"="+y)); Map<String,Employee>
		 * p=emp.stream().collect(Collectors.toMap(Employee::getName,Function.identity()
		 * )); p.forEach((x,y)->System.out.println(x+"="+y)); long
		 * o=emp.stream().count(); System.out.println(o); long d=
		 * emp.stream().filter(x->x.getSalary()>40000).map(y->y.getName()).count();
		 * System.out.println(d);
		 * emp.stream().filter(x->x.getSalary()>40000).map(y->y.getName()+y.getAge()).
		 * forEach(x->System.out.println(x)); List<String> ee=
		 * emp.stream().filter(x->x.getSalary()>40000).map(y->y.getName()+y.getAge()).
		 * collect(Collectors.toList()); ee.forEach(x->System.out.println(x));
		 */
		// Map<Integer,Employee>
		// zz=emp.stream().filter(x->x.getSalary()>50000).collect(Collectors.toMap(x->x.getId(),y->y));
		// System.out.println(zz);
		// Map<Integer,Employee>
		// z=emp.stream().filter(x->x.getSalary()>50000).collect(Collectors.toMap(Employee::getId,Function.identity()));
		// System.out.println(z);
		// Predicate<Employee> p1=s->s.getName().startsWith("p");
		boolean b1 = emp.stream().anyMatch(x -> x.getName().startsWith("p"));
		System.out.println(b1);
		// emp.stream().flatMap(lis-> lis.stream()).forEach(x->System.out.println(x));
		// Map<String,Employee>
		// p=emp.stream().collect(Collectors.toMap(Employee::getName,Function.identity()));
		// p.forEach((x,y)->System.out.println(x+"="+y));
		// Map<Integer,Employee>
		// zz=emp.stream().filter(x->x.getSalary()>50000).collect(Collectors.toMap(x->x.getId(),y->y));
		// System.out.println(zz);
		List<Employee> e = emp.stream().distinct().collect(Collectors.toList());
		e.forEach(x -> System.out.println(x));

	}
}
