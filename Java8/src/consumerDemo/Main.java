package consumerDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		/*
		 * Consumer -> SAM -> accept(T t)
		 Consumer is a functional interface introduced in Java 8 
		 that takes one input and performs an action without 
		 returning any result, commonly used in forEach operations.
		 */
		Consumer<String> consumer = x -> System.out.println(x);
//		consumer.accept("Rahul");//rahul
		Consumer<List<Integer>> listConsumer1 = x -> {
			for(Integer i:x) {
				System.out.println(i+100);
			}
			//or we can also do 
			//x.forEach(i -> System.out.println(i + 100));
		};
//		consumer2.accept(Arrays.asList(1,2,3));
		Consumer<List<Integer>> listConsumer2 = x -> {
			for(Integer i:x) {
				System.out.println(i);
			}
		};
		Consumer<List<Integer>> listConsumer = listConsumer2.andThen(listConsumer1);
		listConsumer.accept(Arrays.asList(1,2,3,4));
		
	}
}
