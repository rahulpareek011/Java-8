package streamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(10, 15, 20, 25);
		
		//before java proble -> hard code
		/*
		   	More boilerplate code
			Hard to read
			Not easily parallelizable
		 */
//		List<Integer> even = new ArrayList<>();
//		for (Integer i : list) {
//		    if (i % 2 == 0) {
//		        even.add(i);
//		    }
//		}

//		

//		String[] array = {"apple","banana","cherry"};
		//Ways to create stream
//		Stream<String> s2 = Arrays.stream(array);//1
		
		//Stream<Integer> s3 = Stream.of(2,1,3);//2
		//s3.sorted((a,b)->b-a).forEach(System.out::println);
		//s3.sorted().forEach(System.out::println);
		
//		Stream<Integer> s4 = Stream.iterate(0, n -> n+1).limit(100);
//		
//		Stream.generate(() -> "Hello").limit(10);
		
		//stream life cycle
		//Stream pipe line
		/*
		 	A stream works in 3 stages:
			Source → Intermediate Operations → Terminal Operation
			1️. Source: Collection, Array, I/O, Generator
			2. Intermediate Operations: Transform data, Return another stream, Lazy (not executed immediately)
			eg. filter(), map(), sorted(), distinct()
			3. Terminal Operations: Produces result, Triggers execution, Ends the stream
			eg. forEach(), collect(), reduce(), count()
		 */
		
		//Internal working: Lazy Evaluation
		List<Integer> list = Arrays.asList(10, 15, 20, 25);
		

		Stream<Integer> s = list.stream();//returns an OBJECT -That object is an instance of a class
		//that IMPLEMENTS Stream
		list.stream()
	    .filter(i -> {
	        System.out.println("filter: " + i);
	        return i % 2 == 0;
	    })
	    .map(i -> {
	        System.out.println("map: " + i);
	        return i * 2;
	    })
	    .forEach(System.out::println);
		/*
		 	filter: 10
			map: 10
			20
			filter: 15
			filter: 20
			map: 20
			40
			filter: 25
			Explanation

			Stream does NOT process all filter() first
			It processes one element fully through pipeline
			Then moves to next element
			
			This is called Vertical Processing
		 */
		
		System.out.println();
		System.out.println("Stream Operation: ");
		
		//Stream Operation
		List<Integer> list2 = Arrays.asList(1,12,6,2,3,4,5,6,7122,4,523,5423);
		List<Integer> filteredList = list2.stream().filter((x) -> x%2==0).collect(Collectors.toList());
		System.out.println(filteredList);//[12, 6, 2, 4, 6, 7122, 4]
//		List<Integer> mappedList = filteredList.stream().map((x) -> x/2).collect(Collectors.toList());
		
		//Chaining: Calling multiple operations one after another on a stream.
		List<Integer> mappedList = filteredList
				.stream()
				.filter((x) -> x%2==0)//in filter it use predicate which is boolean logical function (whatever condition is true it passes ahead)
				.map((x) -> x/2)//map transpose the data like function because it takes function inside it so we transform data
				.distinct()//gives unique elements
				.sorted((a,b)-> b-a)//sorted by default sort ascending by default we can pass comparator -> compare method implementation
				.collect(Collectors.toList());//in collect using collectors.toList() we can set all data to new list
		System.out.println(mappedList);//[3561, 6, 3, 2, 1]
		
		mappedList.stream()
			.limit(2)//how many elements you want from starting
			.forEach((x)->System.out.print(x+" "));//3561 6 
		
		System.out.println();
		
		mappedList.stream()
			.skip(2)//how many elements you want to skip from starting
			.forEach((x)->System.out.print(x+" "));//3 2 1
		
		System.out.println();
		System.out.println();
		
		List<Integer> list3 = Stream
				.iterate(0, x-> x+1)
				.skip(1)
				.limit(101)
				.filter(x-> x%2==0)
				.map(x-> x/2)
				.peek(x-> System.out.print(x+ " "))
				.collect(Collectors.toList());
		//System.out.println(list3);
		System.out.println();
		System.out.println();
		
		Integer value = Stream
			.iterate(0, x-> x+1)
			.limit(101)
			.filter(x-> x%2==0)
			.map(x-> x/20)
			.distinct()
			.peek((x)-> System.out.print(x+" "))//internally usage consumer which takes only, return nothing
			.max((a,b)-> a-b)//gives max value
			.get();
		System.out.println();
		System.out.println(value);
		
		System.out.println();
		
		Long value2 = Stream
				.iterate(0, x-> x+1)
				.limit(101)
				.filter(x-> x%2==0)
				.map(x-> x/20)
				.distinct()
				.peek((x)-> System.out.print(x+" "))
				.count();//returns total value
			System.out.println();
			System.out.println(value2);
			
		System.out.println();
		System.out.println("reduce() in stream: ");
		
		//reduce() is a terminal operation in this we combine stream elements repeatedly 
		//using a BinaryOperator to produce a single value.
		/*
		 	Use reduce() when:
			You want one result from many elements
			Operations like: sum, max, min, product, string concatenation, custom aggregation
		*/
		//reduce(BinaryOperator<T>)
		List<Integer> list5 = List.of(1, 2, 3, 4);

		Optional<Integer> sum =
		    list5.stream()
		        .reduce((a, b) -> a + b);

		System.out.println(sum.get()); // 10
		System.out.println();
		
		//reduce(T identity, BinaryOperator<T>) - in identity we pass default value in case stream is empty
		int sum2 =
			    list5.stream()
			        .reduce(0, (a, b) -> a + b);

			System.out.println(sum); // 10
			
		Stream.iterate(1, (n) -> n+1).limit(10).sorted((a,b)->b-a).forEach((i) -> System.out.println(i));
		//IntStream.range(1, 6).forEach((i)-> System.out.println(i));
		
			
	}
}