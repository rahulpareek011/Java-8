package variableAndThisInLamExp;

//public class Main {
//	int b = 4;//instance
//	private void doSomething() {
//		int a = 2;
//		Employee employee = () -> {
//			//a = 10; we can't use local inside lambda
//			b=3;//but we can use instance variable in lambda
//			System.out.println(b);
//			return "100";
//		};
//		System.out.println(b);
//		System.out.println(employee.getSalary());
//	}
//	
//	public static void main(String[] args) {
//		Main main = new Main();
//		main.doSomething();
//	}
//}



public class Main {
	int x = 10;
	//lets see some difference b/w lambda expression and in anonymous inner class
	private void doSomething() {
		//int x = 10; cause error on lambda expression printing x
		Employee employee = () -> {
			//x = 10;//this is local variable
			System.out.println(this.x);//but here i can't access
			return "100";
		};
		
		Employee employee1 = new Employee() {//because this is now implementation class
			int x = 10;//this is instance variable in seprate class
			public String getSalary() {
				System.out.println(this.x);//so i can access it here
				return "100";
			}
		};
		
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.doSomething();
	}
}
