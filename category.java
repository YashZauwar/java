
import java.util.*;
public class category {

	
	 
	public static void main(String[] args){
		String[] balls = { "red", "blue", "green"};
		String[] bats = { "mrf", "ss", "brit","local"};
		String[] articles = { "watch", "pen", "paper"};
		Scanner sc= new Scanner(System.in);
		String input= sc.next();
		sc.close();
		for(int i=0;i<=4;i++)
		{
			
			if(input.contains(balls[i]))
			{
				System.out.println(input + "  belongs to Balls Category");
			}
			else if(input.contains(bats[i]))
				{
					System.out.println(input + "  belongs to Bats Category");
				}
			else if(input.contains(articles[i]))
			{
				System.out.println(input + "  belongs to articles Category");
			}
			
			
		}
	
		
			
			
	}
}
