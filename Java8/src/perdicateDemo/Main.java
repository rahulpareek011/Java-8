package perdicateDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main{
	
	public static void main(String[] args) {
//		Predicate<Integer> predicate = i -> i>100000;
//		System.out.println(predicate.test(100));
		/*
		 * Predicate<T> is a functional interface in java.util.function package.
		 * Usage:
		 To represent conditions / boolean logic as objects, especially when working with:
			Lambda expressions
			Streams
			Collections filtering
		 */
		
//		List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		Predicate<Integer> predicate = n -> n%2==0;
//		for(Integer num : ls) {
//			if(predicate.test(num)) {
//				System.out.println(num);
//			}
//		}
		
		//and() Logically (&&)
		Predicate<String> StartsWithLetterV = x -> x.toLowerCase().charAt(0)=='v';
//		System.out.println(StartsWithLetterV.test("Vipul"));
		
		//default and static method inside predicate interface
		Predicate<String> EndWithLetterL = x -> x.toLowerCase().charAt(x.length()-1)=='l';
//		System.out.println(StartsWithLetterV.and(EndWithLetterL).test("Vipul"));
		
		//or() - Logically (||)
		Predicate<Integer> lessThan5 = x -> x<5;
		Predicate<Integer> greaterThan20 = x -> x>20;
//		System.out.println(lessThan5.or(greaterThan20).test(3));
//		System.out.println(lessThan5.or(greaterThan20).test(25));
//		System.out.println(lessThan5.or(greaterThan20).test(15));
		
		//negate() - Logically (!)
		Predicate<Integer> even = x -> x%2==0;
		Predicate<Integer> odd = even.negate();
//		System.out.println(even.negate().test(3));
//		System.out.println(odd.test(7));
		
		//equal() - static method
		Predicate<String> isVipul = Predicate.isEqual("Vipul");
		System.out.println(isVipul.test("Vipul"));//true
	}

}
