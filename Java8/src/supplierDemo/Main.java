package supplierDemo;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
	public static void main(String[] args) {
		/*
		 * Supplier: Supplier<T> is a functional interface that supplies a value 
		 without taking any input.
		 Usage: commonly used for lazy value generation.
		 
		 SAM -> test();
		 */
		
		//Supplier<Integer> supplier = () -> 1;
		//System.out.println(supplier.get());//1
		//that's it there is nothing more in this
		
		
		//lets revise everything
		
		//predicate is telling true or false based on condition (boolean based function)
		Predicate<Integer> predicate = x -> x%2==0;
		//function takes input perform operation on it and return it back
		Function<Integer,Integer> function = x -> x*x;
		//consumer only consume value gives nothing(udhar lene wala dost who never pays back)
		Consumer<Integer> consumer = x -> System.out.println(x);
		//supplier which only gives value, but takes nothing (sirf gyan deta hai)
		Supplier<Integer> supplier = () -> 100;
		
		if(predicate.test(supplier.get())) {
			consumer.accept(function.apply(supplier.get()));
		}
	}
}
