package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
* @author -- tarun kumar nagora
*/
public class SetClass {

	public static void main(String[] args) {
		 Set <String> s1 = new LinkedHashSet<String> ();
		 
		 s1.add("tarun");
		 s1.add("Jhon");
		 s1.add("alex");
		 s1.add("vijay");
		 s1.add("vijay");
		 s1.add("vijay");
		 s1.add("vijay");
		 s1.add(null);
		 s1.add("taruntt");
		 
		
		 
		 
		 Iterator<String> it =s1.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 
		
	 
		 
	}

}
