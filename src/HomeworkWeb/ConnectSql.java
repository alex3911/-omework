package HomeworkWeb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectSql {
	
	 private static final String url = "jdbc:mysql://localhost:3306/library?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	    private static final String user = "root";
	    private static final String password = "1111";

	private static Connection con;
	    private static Statement stmt;
	    private static ResultSet rs;

	    public static void main(String args[]) {
	    	String query = "select ID, author, book title, genre";

	        try {
	            
	            con = DriverManager.getConnection(url, user, password);

	            
	            stmt = con.createStatement();

	            
	            rs = stmt.executeQuery(query);

	            while (rs.next()) {
	        int ID = rs.getInt(1);
	        String author = rs.getString(2);
	   		String BookTitle = rs.getString(3);
	   		System.out.printf("ID: %d, author: %s, book title: %s %n", ID, author, BookTitle);
	            }

	        } catch (SQLException sqlEx) {
	            sqlEx.printStackTrace();
	        } finally {
	            
	            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
	            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
	            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
	        }
	    }
	   
}
