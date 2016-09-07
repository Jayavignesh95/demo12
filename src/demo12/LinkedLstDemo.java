package demo12;

import java.util.*;

public class LinkedLstDemo {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("A");
		l.add("B");
		l.addFirst("First A");
		l.addLast("Last ");
		l.add(2, "Second ");
		l.add("C");
		l.add("D");
		System.out.println(l.toString());
		System.out.println(l.contains("A"));
		System.out.println(l.indexOf("C"));
		l.set(6, "C1");
		Iterator i = l.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("Reverse Order");
		/*
		 * Iterator i1=l.descendingIterator(); while(i1.hasNext()) {
		 * System.out.println(i1.next()); }
		 */
		System.out.println("Peek and Poll");
		System.out.println(l.peek()); 
		Collections.synchronizedCollection(l);
		
		System.out.println(l.toString());
		System.out.println(l.poll());
		System.out.println(l.toString());
	}
}
