import java.util.*;
public class ArrayListExample {
	public static void main(String[] args)
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		for(int i=0;i<100;i++)
		{
			a1.add(i+1);
		}
	
		for(int i=0;i<=a1.size();i+=2)
		{
		a1.remove(i);
		}
		
	System.out.println(a1);
		
	
	}

}
