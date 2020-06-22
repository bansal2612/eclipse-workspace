import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class sql {

	@Test
	public void sqlconnect() throws ClassNotFoundException, SQLException
	{
		String s="jdbc:mysql://localhost:1433/ankitDB";
		Class.forName("com.mysql.jdbc.Driver");	
		Connection con=DriverManager.getConnection(s, "DESKTOP-CBC06U2\\Ankit Bansal", "");
		Statement st=con.createStatement();
		String query = "select *  from Customers;";
		ResultSet rs= st.executeQuery(query);	
		while(rs.next())
		{
			String s1=rs.getString(2);
			System.out.println(s1);
		}
		con.close();
	}
}
