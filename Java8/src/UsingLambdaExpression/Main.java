package UsingLambdaExpression;

public class Main {
	public static void main(String[] args) {
		//Employee employee = new SoftwareEngineer();no need of separate implementation class anymore
		
		//interface reference can e used to hold lambda expression
		Employee employee = () -> "Software Engineer";
		//so, lambda expression is nothing but implementation of that single
		//abstract method inside functional interface.
		System.out.println(employee.getName());
		
		Employee editor = () -> "Editor";//we can write separate multiple implementation without
		//writing separate implementation classes
		System.out.println(editor.getName());
	}
}
