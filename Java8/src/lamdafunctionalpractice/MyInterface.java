package lamdafunctionalpractice;

/*
 FunctionalInterface annotation restrict the interface to be a 
 functional interface. So if people have already used some lambda
 expression and some new team member added another abstract method
 in the interface all lambda expression will have errors.
 */

@FunctionalInterface
public interface MyInterface {
	//only single abstract method should be there
	public void SayHello();
	
	//default and static method can exist as much as we want
	default void hello() {
		
	};
	static void hi() {
		
	}
	
}
