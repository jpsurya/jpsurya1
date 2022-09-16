package day14collection3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UseStudent {

	public static void main(String[] args) {
		Student e1 = new Student("prakash",1, "biology",1200);
		Student e2 = new Student("jaya prakash",2, "bioMaths",1190);
		Student e3 = new Student("loki",3, "computer",900);
		Student e4 = new Student("hari",4, "computer",800);
		Student e5 = new Student("jp",5, "history",1180);
		ArrayList<Student> stu = new ArrayList<>();
		stu.add(e1);
		stu.add(e2);
		stu.add(e3);
		stu.add(e4);
		stu.add(e5);
		List<Student>s=stu.stream().filter(x->x.getMark()>1000).collect(Collectors.toList());
          for(Student a:s) {
        	  System.out.println(a);
          }
          stu.stream().filter(x->x.getMark()<1000).forEach(x->System.out.println(x));
          Map<Integer,Student> b=stu.stream().collect(Collectors.toMap(Student::getId,Function.identity()));
          b.forEach((x,y)->System.out.println(x+" "+y));
          stu.stream().map(x->x.getName()).forEach(x->System.out.println(x));
          long l=stu.stream().count();
          System.out.println(l);
          stu.stream().filter(x->x.getMark()>1000).map(x->x.getBranch()).forEach(x->System.out.println(x));
	}

}
