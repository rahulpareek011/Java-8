package lamdafunctionalpractice;

////default methods
//
////Interview tricky question(asked in online compiler) - what will be the output
//interface A{
//	default void sayHello() {
//		System.out.println("Hello from A");
//	}
//}
//
//interface B{
//	default void sayHello() {
//		System.out.println("Hello form B");
//	}
//}
//
//class MyClass implements A,B{//compile time-> error duplicates entry(Ambiguous call – which sayHello() should Test inherit?)
//	public static void main(String[] args) {
//		MyClass myClass = new MyClass();
//		myClass.sayHello();
//	}
//	//we can give implementation of method that we want
//		public void sayHello() {
//			A.super.sayHello();
//		}
//}


//static methods
interface A{
	static void sayHello() {
		System.out.println("Hello from static method say Hello");
	}
	
	default void sayBye() {
		System.out.println("Hello from default method say Bye");
	}
}

class Demo implements A{
	public static void main(String[] args) {
		Demo d1 = new Demo();
		//d1.sayHello();//not access like this coz it can't even see this static method in our class i'll give proof next
		//Demo.sayHello();//even not access like this also
		A.sayHello();//called using interfaceName.methodName()
		d1.sayBye();//default can be called
	}
	static void sayHello() {//here we're not overriding we're writing out own method
		System.out.println("hello i'm trying to override interface static method");
	}// look no errors coz the class which is implementing the interface it can't even see it
	//means implementation class can't see interface static methods
}
