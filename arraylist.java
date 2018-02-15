import java.util.*;
class arraylist{
 public static void main(String args[]){
 
 /*ArrayList<String> a1=new ArrayList<String>();
  a1.add("{");
  a1.add("[");
  ArrayList<String> a2=new ArrayList<String>();
  a2.add("}");
  a2.add("]");
  */
	Scanner sc = new Scanner(System.in);
	String s1= sc.next();
	sc.close();
	 int c1=0;
	 int c2=0;
	
	String[] seperated = s1.split("");
	String[] s2= s1.split("");
	if((seperated.length%2)==0)
	{
		for(int i=0; i<seperated.length;i++)
		{
			if(seperated[i]=="{")
			{
				for(int j=i+1; j<s2.length;j++)
					if(s2[j]=="}")
						c1=c1+1;
				System.out.println(c1);					}
			if(seperated[i]=="[")
			{
				for(int j=i+1; j<s2.length;j++)
					if(s2[i]=="]")
						c2=c2+1;
					}

		}
		System.out.println(c1);
		System.out.println(c2);
if((c1==0 && c2==0))
	System.out.println("un  balanced");
	
	}
	else if(c1==c2)
		System.out.println("balanced");
	else {
		System.out.println(" unbalanced");
	}
		
 }
}
