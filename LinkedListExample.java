import java.util.*;
public class LinkedListExample {
public static void main(String[] args){
	LinkedList<String > l1 = new LinkedList<String>();
	l1.add("Y");
	l1.add("A");
	l1.add("S");
	l1.add("H");
	l1.addFirst("Z");
	l1.addLast("Z");
	int c=l1.indexOf("A");
	System.out.println(c);
	for(String n : l1)
	{	System.out.println(n);
}
	}
}
