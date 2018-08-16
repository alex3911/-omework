package HomeworkWeb.Operate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import HomeworkWeb.Interface.DeleteBook;

public class OperateDelete implements DeleteBook{


	 private static final String url = "jdbc:mysql://localhost:3306/library?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	    private static final String user = "root";
	    private static final String password = "1111";

	private static Connection con;
	    private static Statement stmt;
	    
	@Override
	public void DeleteBook() {
String query = "DELETE FROM books WHERE ID = 5";
    	
    	try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
