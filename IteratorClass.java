package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

/*
* @author -- tarun kumar nagora
*/
public class IteratorClass {

	public static void main(String[] args) {
		List<Integer> l1= new ArrayList<Integer>();
		l1.add(12);
		l1.add(56);
		l1.add(78);
		l1.add(89);
		
	
		
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(78);
		l2.add(45);
		//l2.addAll(l1);
		l2.addAll(1, l1);
		//System.out.println(l2);
		System.out.println("index based copy"+l2);
		
Iterator<Integer> it = l1.iterator();
  ///forword direction
System.out.println("forword direction");
   while(it.hasNext())
   {
	   System.out.println(it.next());
   }
   
   
  ListIterator<Integer> it1 = l1.listIterator();
  
  //forword
  System.out.println("forword direction.....................");
  while(it1.hasNext())
  {
	  System.out.println(it1.next());
  }

  //backword
  System.out.println("Backword direction......................");
  while(it1.hasPrevious())
  {
	  System.out.println(it1.previous());
  }
  
  Stack<Integer>v1 = new Stack<Integer>();
  v1.push(12);
  v1.push(45);
  v1.push(85);
  v1.push(4);
  System.out.println(v1);
  System.out.println(v1.peek());
  v1.pop();
  System.out.println(v1);
  System.out.println(v1.peek());
  
  Enumeration e1 = v1.elements();
  while(e1.hasMoreElements())
  {
	  System.out.println(e1.nextElement());
  }
  
  }

}
