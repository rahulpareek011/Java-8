package biFunctionDemo;

import java.util.function.BiFunction;

public class Main {
	public static void main(String[] args) {
		//BiFunction takes two arguments and returns one result.
		//BiFunction<T, U, R>
		//R apply(T t, U u);
		
		// have only default method -> andThen()
		BiFunction<String,String,Integer> biFunction = (x,y) -> x.length()+y.length();
		System.out.println(biFunction.apply("Rahul", "Pareek"));
	}
}
