import java.util.Arrays;
import java.util.*;

public class split1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1= sc.next();
		sc.close();
		int c=0;
		//s1= "{ {  } }";
	//	char[] ch=s1.toCharArray();
		String[] seperated = s1.split("");
	System.out.println(Arrays.toString(seperated));
		for (int i=0;i<seperated.length;i++){
			 
            System.out.println(seperated[i]);

         }
		if(seperated.length%2!=0)
		{
			System.out.println("Un Balanced");
		}
		for(int i=0;i<seperated.length;i++){
			for(int j=0;j<seperated.length;j++)
		if((seperated[i].equals("{"))&&(seperated[j].equals("}"))) {
			 c=c+1;
		//	System.out.println("Balanced");
		}
		else if ((seperated[i].equals("["))&&(seperated[j].equals("]"))) {
			c=c+1;
		
		}
		
		else 
		{
			
			//System.out.println("UnBalanced");
		}
		}
		if(c==0){
			System.out.println("1Balanced");
		}
		else
		{
			System.out.println("Un Balanced");
		}
	//	System.out.println(s1.charAt(1));
	/*	if((s1.charAt(0)=="{")&&(s1.charAt(1)=="}"))
		{

			System.out.println("Balanced");
		}
		else
		{
			System.out.println("UnBalanced");
		}
		*/
	}
}
