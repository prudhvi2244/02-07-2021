package p1.p2;

import java.util.Arrays;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;

public class ImmutableListDemo2 {

	public static void main(String[] args) {
	
		ImmutableList<Integer> il1=ImmutableList.of(10,90,800,20,1,4);
		
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
		il1.forEach(i1->System.out.println(i1));
		
		
		UnmodifiableIterator<Integer> iterator=il1.iterator();
		
		System.out.println("Iterating over elements of Immutable List using UnmodifiableIterator");
		while(iterator.hasNext())
		{
			Integer i1=iterator.next();
			System.out.println(i1);
		}
		
		
		
			
		
	}

}
