package threadUsingLambdaExpression;

public class MyThreadClass implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Hello "+i);
		}
	}
}
