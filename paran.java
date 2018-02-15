

import java.util.*;
class paran{
	static char [] a;
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
	a=s1.toCharArray();
	
	//System.out.println(a[0]);
	
	if((a.length%2)==0)
	{
		for(int i=0; i<a.length;i++)
		{
			if(a[i]=='{')
			{
				for(int j=i+1; j<a.length;j++)
					if(a[j]=='}')
						c1=c1+1;
				//System.out.println(c1);	
				}
			else if(a[i]=='[')
			{
				for(int j=i+1; j<a.length;j++)
					if(a[j]==']')
						c2=c2+1;
					}

		}
	}
		
		System.out.println(c1);
		System.out.println(c2);
if((c1==0 && c2==0)){
	System.out.println("un  balanced");
	}
	else if(c1>0||c2>0)
	{
		System.out.println("balanced");}
	else {
		System.out.println(" unbalanced");
	}
		
}
}
