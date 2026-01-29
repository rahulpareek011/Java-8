package unaryBinaryOperator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
	public static void main(String[] args) {
		Function<Integer,Integer> function = x -> x*x;
		//so, if using same input & return type then go for UnaryOperator
		//UnaryOperator<T> extends Function<T, T> 
		//It is basically a special class of function
		UnaryOperator<Integer> uo = x -> x*x;
		System.out.println(uo.apply(2));//4
		System.out.println(function.apply(3));//9
		
		
		//BinaryOperator<T> extends BiFunction<T,T,T>
		//It is special class of BiFunction
		BiFunction<Integer,Integer,Integer> bifunction = (x,y) -> x+y; 
		BinaryOperator<Integer> bo = (x,y) -> x+y; 
		System.out.println(bifunction.apply(10,20));//30
		System.out.println(bo.apply(30, 15));//45
	}
}
