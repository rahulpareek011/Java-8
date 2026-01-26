package lamdafunctionalpractice;

//Inheritance in functional interface

@FunctionalInterface
interface InheritanceDemo {//Parent
	public void sayHello(); //parent is functional interface
}


//question -> Is child functional interface coz its extending parent functional interface
@FunctionalInterface
interface Child extends InheritanceDemo{
	//doesn't give error after using annotation means totally functional interface
	//coz it have only one SAM of parent class
	
	//public void hi();//Invalid '@FunctionalInterface' annotation; Child is not a functional interface
	
	public void sayHello();//same method allowed
	//default also allowed
	default void ramram() {
		
	}
}