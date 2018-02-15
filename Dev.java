

//import java.util.Vector;

public class Dev {
	private String idNumber;
	private String Desg;
	private String name;
	private int sal;
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getDesg() {
		return Desg;
	}
	public void setDesg(String desg) {
		this.Desg = desg;
	}
	
	public String toString(){
		return idNumber+" "+Desg+" "+name+" "+sal;
	}
}
