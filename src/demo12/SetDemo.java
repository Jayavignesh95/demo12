package demo12;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
  public static void main(String[] args) {
	TreeSet<String> tree = new TreeSet<String>();
	tree.add("one");
	tree.add("one");
	tree.add("two");
	tree.add("three");
	//tree.add(null); null isnot allowed
	System.out.println(tree.toString());
	//System.out.println(tree.ceiling("two"));
	System.out.println(tree.first());
	System.out.println(tree.last());
	  //Hash Set
	HashSet<String> h=new HashSet<String>();
	h.add("one");
	h.add("two");
	//h.add("two");
	h.add("hash");
	h.add("four");
	h.add("Three");
	h.add(null);
	System.out.println(h.size());
	System.out.println(h.contains("Three"));//used for find the presence of  a element 
	System.out.println(h.isEmpty());
	System.out.println(h.hashCode());
	h.add("five");
	System.out.println(h.remove("two"));
	System.out.println(); h.spliterator();
	System.out.println(h.toString());
}
}
