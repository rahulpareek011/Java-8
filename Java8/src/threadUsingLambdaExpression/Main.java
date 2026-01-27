package threadUsingLambdaExpression;

public class Main {
	public static void main(String[] args) {
		//now in lambda expression
		//i don't want implementation class -> MyThreadClass
		//MyThreadClass myThreadClass = new MyThreadClass();
		
		//Runnable (functional interface)
		Runnable runnable = () -> { //functional interface acting as data type for lambda expression
			for(int i=1;i<=10;i++) {
				System.out.println("Hello "+i);
			}
		};
		Thread thread = new Thread(runnable);
		thread.run();
	}
}
