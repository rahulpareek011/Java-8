package biPredicateDemo;

import java.util.function.BiPredicate;

public class Main {

	public static void main(String[] args) {
		//BiPredicate -> When a condition depends on two values, not one.
		
		//have only default methods -> and, or , negate
		BiPredicate<Integer,Integer> biPredicate = (x,y) -> x%2==0 && y%2==0;
//		System.out.println(biPredicate.test(2, 10));
		
		BiPredicate<Integer,Integer> biPredicate2 = (x,y) -> (x+y)%2==0;
		System.out.println(biPredicate.test(20, 10));//True
		System.out.println(biPredicate.test(25, 10));//False
	}
 
}
