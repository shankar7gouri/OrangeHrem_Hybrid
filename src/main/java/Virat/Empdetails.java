package Virat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Empdetails {
	public static void main(String[] args)throws Throwable
	{
		//load jdbc
		Class.forName("com.mysql.jdbc.Driver");
		//connect to data base
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdetails","root","");
		Statement smt=con.createStatement();
		smt.executeUpdate("insert into emp values('Akhilesh',501,'bnglr',50000,9783883748)");
		//smt.executeUpdate("Upadate emp name='Shnskr'where ename='Akhilesh'");
		//smt.executeUpdate("update emp set esal=70000 where esal=50000");
		//con.close();
		
		
	}

}
