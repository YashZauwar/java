import java.util.Scanner;
public class Concat {
	static Scanner a = new Scanner(System.in);


public static void main(String [] args)
{
	String s1 = a.next();
	String s2 = a.next();
	String s3 = s1.concat(s2);

	System.out.println(s3);
}
}