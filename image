import java.sql.*;  
import java.io.*;  
public class image {  
public static void main(String[] args) {  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/sonoo","root","root");  
              
PreparedStatement ps=con.prepareStatement("insert into imgtable(name, photo) values(?,?)");  
String sql= "DELETE FROM imgtable where id = 2";
Statement ps1= con.createStatement( ); 
ps.setString(1,"sonoo");  
FileInputStream fin=new FileInputStream("d:\\ee.png");  
ps.setBinaryStream(2,fin,fin.available());
//ps.setString(1,"3"); 
int i=ps.executeUpdate();  
System.out.println(i+" records affected");  
int j=ps1.executeUpdate(sql);
System.out.println(j+" records affected");       
con.close();  
}catch (Exception e) {e.printStackTrace();}  

}  
}  
