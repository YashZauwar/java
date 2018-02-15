

import java.util.Scanner;
import java.util.Vector;



public class Details {
	private static Vector<Dev> dev= new Vector<Dev>();
	
	public boolean addDetails(Dev de){
		boolean c= dev.add(de);
	
	return c;
	}
	
	
	public void printDet(String v){
		for(int j=0; j<dev.size(); j++)
		{
			Dev i= dev.get(j);
		if(i.getDesg().equals(v)){
				
				System.out.println(i.getDesg()+" "+i.getIdNumber()+" "+i.getName()+" "+i.getSal());
				break;
			}
		}
		
	}
	public static void main(String[] args){
		Details det= new Details();
	Dev i1= new Dev();
	i1.setIdNumber("I1234");
	i1.setSal(10000);
	i1.setName("Motu");
	i1.setDesg("dev");
	
	Dev man= new Dev();
	man.setIdNumber("I23454");
	man.setSal(10045);
	man.setName("Mot5333333u");
	man.setDesg("manager");
	
	Dev i2= new Dev();
	i2.setIdNumber("I1235");
	i2.setSal(23000);
	i2.setName("Moty");
	i2.setDesg("dev2");
	
	
	det.addDetails(i1);
	det.addDetails(man);
	det.addDetails(i2);
//	System.out.println(dev);
	
	Scanner sc= new Scanner(System.in);
	String v= sc.next();
	sc.close();
	//System.out.println(v);
	det.printDet(v);
	
}
}
