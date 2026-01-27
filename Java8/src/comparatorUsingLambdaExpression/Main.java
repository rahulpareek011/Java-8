package comparatorUsingLambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
//		List<Integer> l1 = new ArrayList();
//		l1.add(20);
//		l1.add(40);
//		l1.add(10);
//		l1.add(5);
//		l1.add(16);
//		l1.add(67);
//		System.out.println("Before Manual Sorting: "+l1);
//		Collections.sort(l1);
//		System.out.println("Default Sorting: "+l1);
//		//comparator -> functional interface -> have compare(T a,T b) method
//		Collections.sort(l1,(a,b)-> b-a);
//		System.out.println("After Manual Sorting: "+l1);
		
		
//		Set<Integer> s1 = new TreeSet<>();
//		s1.add(20);
//		s1.add(40);
//		s1.add(10);
//		s1.add(5);
//		s1.add(16);
//		s1.add(67);
//		System.out.println("Before manual sorting "+s1);
//		Set<Integer> s2 = new TreeSet<>((a,b)->b-a);
//		s2.add(20);
//		s2.add(40);
//		s2.add(10);
//		s2.add(5);
//		s2.add(16);
//		s2.add(67);
//		System.out.println("After manual sorting "+s2);
		
		
//		Map<Integer,String> t1 = new TreeMap<>();
//		t1.put(2,"z");
//		t1.put(1,"y");
//		t1.put(3,"x");
//		System.out.println("Before manual sorting "+t1);
//		Map<Integer,String> t2 = new TreeMap<>((a,b)->b-a);
//		t2.put(2,"z");
//		t2.put(1,"y");
//		t2.put(3,"x");
//		System.out.println("After manual sorting "+t2);
		
		Student s1 = new Student(33,"Braj");
		Student s2 = new Student(22,"Choti");
		Student s3 = new Student(43,"Abhay");
		
		List<Student> li = new ArrayList<>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		System.out.println("Before Manual Sorting "+li);
		Collections.sort(li,(a,b)->b.name.compareTo(a.name));
		System.out.println("After Manual Sorting "+li);
		Collections.sort(li,(a,b)->b.id-a.id);
		System.out.println("After Manual Sorting "+li);
	}
}
