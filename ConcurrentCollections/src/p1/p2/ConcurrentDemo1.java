package p1.p2;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentDemo1 extends Thread {

	static ArrayList<String> al = new ArrayList<String>();

	@Override
	public void run() {

		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		al.add("3Sha");
		
	}

	public static void main(String[] args) {

		al.add("RAJ");
		al.add("Anushka");
		al.add("9tara");
		
		ConcurrentDemo1 childThread=new ConcurrentDemo1();
		childThread.start();
		
		Iterator<String> iterator=al.iterator();
		
		while(iterator.hasNext())
		{
			String name=iterator.next();
			System.out.println(name);
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		System.out.println(al);

	}

}
