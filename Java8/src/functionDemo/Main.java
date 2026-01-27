package functionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
	public static void main(String[] args) {
		/*
		 * Function<T, R> :
			 Function is a predefined functional interface introduced in Java 8 that
			 represents a transformation logic, where an input of type T is 
			 converted into an output of type R.
			 USAGE: To represent data transformation & commonly used in stream
			 mapping operations.
			 
			 have SAM -> apply()
			 R apply(T t); //This is where actual logic goes.
		 */
		Function<String,Integer> function = x -> x.length();
//		System.out.println(function.apply("AbaDabaJaba"));
		
		Function<String,String> function2 = x -> x.substring(0,3);
//		System.out.println(function2.apply("Rahul"));
		
		Function<List<Student>,List<Student>> studentWithVipPrefix = x -> {
			List<Student> l1 = new ArrayList<>();
			for(Student i: x) {
				if(function2.apply(i.getName()).equalsIgnoreCase("vip")) {
					l1.add(i);
				}
			}
			return l1;
		};
		Student s1 = new Student(1,"Vipul");
		Student s2 = new Student(2,"Vipulnav");
		Student s3 = new Student(3,"Arnav");
		List<Student> students = Arrays.asList(s1,s2,s3);
		List<Student> filteredStudents = studentWithVipPrefix.apply(students);
//		System.out.println(filteredStudents);
		
		
		//FUNCTION CHAINING (andThen -> andThen → first THIS, then THAT)
		 Function<String,String> f1 = x -> x.toUpperCase();
		 Function<String,String> f2 = x -> x.substring(0,3);
//		 System.out.println(f1.andThen(f2).apply("Rahul"));
		 
		 Function<Integer,Integer> f3 = x -> x*2;
		 Function<Integer , Integer> f4 = x -> x*x*x;
		 //Executes the current function first and then the given function
		 System.out.println(f3.andThen(f4).apply(3));//Equivalent to: t -> f4.apply(f3.apply(t))
		 //Executes the given function first and then the current function.
		 System.out.println(f3.compose(f4).apply(3));//Equivalent to: t -> f3.apply(f4.apply(t))
		 
		 //identity() //static method -> called with interface name
		 Function<String,String> identityFunction = Function.identity();
//		 System.out.println(identityFunction.apply("Vipul"));
}
	
	private static class Student{
		private int id;
		private String name;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public Student(int id, String name) {
			this.id = id;
			this.name = name;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + "]";
		}
		
		
	}
}
