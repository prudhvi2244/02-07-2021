package p1.p2;

import java.util.Arrays;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;

public class ImmutableListDemo1 {

	public static void main(String[] args) {
	
		ImmutableList<String> il1=ImmutableList.copyOf(Arrays.asList("Raj","4Sha","10Tara","Nanacy","Raj"));
		
		System.out.println(il1);
		
		System.out.println("Accessing Elements of ImmutableList using for loop");
		
		for(int i=0;i<il1.size();i++)
		{
			System.out.println("Element at index position:-"+i+" is :"+il1.get(i));
		}
		
		System.out.println("Accessing Elements of ImmutableList using index positions");
		
		System.out.println("Element at index position-0:"+il1.get(0));
		System.out.println("Element at index position-1:"+il1.get(1));
		System.out.println("Element at index position-2:"+il1.get(2));
		System.out.println("Element at index position-3:"+il1.get(3));
		System.out.println("Element at index position 4:"+il1.get(4));
		
		System.out.println("Iterating over elements of Immutable List using forEach() method");
		il1.forEach(name->System.out.println("Employee Name :"+name));
		
		
		UnmodifiableIterator<String> iterator=il1.iterator();
		
		System.out.println("Iterating over elements of Immutable List using UnmodifiableIterator");
		while(iterator.hasNext())
		{
			String name=iterator.next();
			System.out.println("Employee Name :"+name);
		}
		
		// il1.add("Praveen"); : Insert or remove operations not supported
		
			
		
	}

}
