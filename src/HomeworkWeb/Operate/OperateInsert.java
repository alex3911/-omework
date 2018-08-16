package HomeworkWeb.Operate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import HomeworkWeb.Interface.InsertBook;

public class OperateInsert implements InsertBook {
	

	 private static final String url = "jdbc:mysql://localhost:3306/library?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	    private static final String user = "root";
	    private static final String password = "1111";

	private static Connection con;
	    private static Statement stmt;
	    
	@Override
	public void InsertBook() {
    	String query = "INSERT INTO library.books (ID, author, bookTitle, genre) \n" + " VALUES (5, 'AkuNin', 'Mladenets i chert', 'Dedektiv');";
    	
    	try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}        
}

