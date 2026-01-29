package referenceInJava8;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
	
//	public static void hello(String s) {
//		System.out.println("Hello");
//	}
	
	public void hello(String s) {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		MethodReferenceDemo mrd = new MethodReferenceDemo();
		List<String> students = Arrays.asList("Alice","Bob","Charlie");
		//students.forEach(MethodReferenceDemo::hello);
		students.forEach(mrd::hello);//object reference::method name
	}

}
