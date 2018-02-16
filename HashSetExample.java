import java.util.*;
public class HashSetExample {
public static void main(String[] args){
	HashSet<Integer> hs = new HashSet<Integer>();
	HashSet<Integer> hs1 = new HashSet<Integer>();
	hs.add(1);
	hs.add(2);
	hs.remove(2);
	int c = hs.size();
	System.out.println(c);
	hs1=(HashSet) hs.clone();
	for(Integer n : hs1)
	{
		System.out.println(n);
	}
	for(Integer n1 : hs)
	{
		System.out.println(n1);
	}
}
}
