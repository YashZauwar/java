import java.sql.*;  
class MySqlCon{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  //registering driver
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/sonoo","root","root");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  




ResultSet rs=stmt.executeQuery("select * from emp");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
ResultSetMetaData rsmd=rs.getMetaData();  

System.out.println("Total columns: "+rsmd.getColumnCount());  
for(int i=1;i<3;i++)
{
System.out.println("Column Name of 1st column: "+rsmd.getColumnName(i));  
}System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  
