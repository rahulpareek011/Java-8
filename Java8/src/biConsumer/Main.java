package biConsumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		//It accepts two argument
		//have same one default method -> andThen()
		BiConsumer<Integer,Integer> biConsumer = (x,y) -> System.out.println(x+y);
		biConsumer.accept(10, 56);//66
	}

}
