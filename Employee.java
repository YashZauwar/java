import java.util.*;
public class Employee {
	public static Emplo(){
	int age;
	String name;
	String gender;
	 Scanner get = new Scanner(System.in);
	    
	        System.out.println("Enter Name of the Employee:");
	        name = get.nextLine();
	        System.out.println("Enter Gender of the Employee:");
	        gender = get.nextLine();
	        System.out.println("Enter Age:");
	        age = get.nextInt();
	}

	   
	    public static void main(String args[])
	    {
	    	Employee  a = new Employee();
a.Emplo()   ; 
System.out.println("Employee Name: "+name);
	        System.out.println("Age: "+age);
	        System.out.println("Gender: "+gender);
	        	    }
	

}
