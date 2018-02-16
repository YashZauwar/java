import java.util.*;
public class Soldiers {

	
public static void main(String[] args){
	//HashSet<Character> hs= new HashSet<Character>();
	HashSet<Integer> hs= new HashSet<Integer>();
	for(int i=0;i<100;i++)
	{
		hs.add(i+1);
	}
	System.out.println(hs);
	if(hs.size()!=0)
	{
for(int i=0;i<100;i+=2)
{
	hs.remove(i);
}
System.out.println(hs);
for(int i=1;i<hs.size();i+=4)
{
hs.remove(i);
}
System.out.println(hs);
{
for(int i=3;i<hs.size();i+=8)
{
hs.remove(i);
}
System.out.println(hs);
for(int i=7;i<hs.size();i+=16)
{
hs.remove(i);
}
System.out.println(hs);
for(int i=15;i<hs.size();i+=24)
{
hs.remove(hs);
}
System.out.println(hs);
}
	}
}
}


