package arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class River {

	public static void main(String[] args) {
		
		Collection<String> river = new ArrayList();
		
		
		river.add("spoorthi"); //ref stores
		river.add("ganga");
		river.add("kaveri");
		river.add("thunga");
		river.add("yamuna");
		
		System.out.println("total elements:"+river.size());
		Iterator<String> itr=river.iterator(); 
		while(itr.hasNext())  //hasnext check 
		{
			String value = itr.next();  //access all the element
			System.out.println("river is :"+value);	
		}
		
		System.out.println("=============================");
		
		
		river.remove("ganga");
		Iterator<String> itrs = river.iterator();
		while(itrs.hasNext())  //hasnext check 
		{
			String values = itrs.next();  //access all the element
			System.out.println("river is :"+values);	
		}
		
		System.out.println("=============================");
		
		river.addAll(river);
		Iterator<String> itr1 = river.iterator();
		while(itr1.hasNext())  //hasnext check 
		{
			String value1 = itr1.next();  //access all the element
			System.out.println("river is :"+value1);	
		}
		
		
		System.out.println("=============================");
		
		river.contains(river);
		Iterator<String> itr2 = river.iterator();
		while(itr2.hasNext())  //hasnext check 
		{
			String value2 = itr2.next();  //access all the element
			System.out.println("river is :"+value2);	
		}
		
		System.out.println("=============================");
		
		river.containsAll(river);
		Iterator<String> itr3 = river.iterator();
		while(itr3.hasNext())  //hasnext check 
		{
			String value3 = itr3.next();  //access all the element
			System.out.println("river is :"+value3);	
		}
		
		System.out.println("=============================");
		
		river.clear();
		Iterator<String> itr4 = river.iterator();
		while(itr4.hasNext())  //hasnext check 
		{
			String value4 = itr4.next();  //access all the element
			System.out.println("river is :"+value4);	
		}
		
		System.out.println("=============================");
	
		
		river.isEmpty();
		Iterator<String> itr5 = river.iterator();
		while(itr5.hasNext())  //hasnext check 
		{
			String value5 = itr5.next();  //access all the element
			System.out.println("river is :"+value5);	
		}
		
		System.out.println("=============================");
		
		river.removeAll(river);
		Iterator<String> itr6 = river.iterator();
		while(itr6.hasNext())  //hasnext check 
		{
			String value6 = itr6.next();  //access all the element
			System.out.println("river is :"+value6);	
		}
		
		System.out.println("=============================");
		
		river.hashCode();
		Iterator<String> itr7 = river.iterator();
		while(itr7.hasNext())  //hasnext check 
		{
			String value7 = itr7.next();  //access all the element
			System.out.println("river is :"+value7);	
		}
		
		System.out.println("=============================");
		
	}
}	
	
	

