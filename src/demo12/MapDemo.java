package demo12;
import java.util.*;
public class MapDemo {
 public static void main(String[] args) {
	TreeMap tmap=new TreeMap();
	tmap.put("a",1);
	tmap.put("1","aa");
	System.out.println(tmap.get("a"));
	System.out.println(tmap.isEmpty());
	System.out.println(tmap.keySet());
	System.out.println(tmap.put("1","Hello"));
}
}
