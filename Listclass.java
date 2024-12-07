package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* @author -- tarun kumar nagora
*/
public class Listclass {

	public static void main(String[] args) {
		
		List<String > l1 = new ArrayList<String>();
		l1.add("tarun");
		l1.add(null);
		l1.add(null);
		l1.add(null);
		l1.add("jhon");
		l1.add("alex");
		l1.add("alex");
		l1.add("alex");
		l1.add("alex");
		l1.add("alex");
		System.out.println(l1);
		Iterator<String> i1 = l1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
    
		List<String> list = new ArrayList<>();
	    list.add("a");
	    list.add("b");
	    list.add("c");
	    list.add("d");
	    list.add("e");
	    list.add("f");

	    Iterator<String> iterator = list.iterator();
	    while (iterator.hasNext()) {
	        String string = iterator.next();
	        System.out.println(string);
	    }
	}
		
	}


