package referenceInJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorReferenceDemo {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice","Bob","Charlie");
		
		//List<Student> students = names.stream().map(x -> new Student(x)).collect(Collectors.toList());
		
		//instead of "x -> new Student(x)" we use -> constructor reference
		List<Student> students = names.stream().map(Student::new).collect(Collectors.toList());
		System.out.println(students);
	}
}