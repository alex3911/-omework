package HomeworkWeb.Operate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import HomeworkWeb.Interface.ExtractLibrary;

public class ExtractOperate implements ExtractLibrary{
	

	 private static final String url = "jdbc:mysql://localhost:3306/library?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	    private static final String user = "root";
	    private static final String password = "1111";

	private static Connection con;
	    private static Statement stmt;
	    private static ResultSet rs;

	@Override
	public void ExtractLibrary() {
    	
    	String query = "select ID, author, bookTitle, genre from books";

        try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

            while (rs.next()) {
        int ID = rs.getInt("ID");
        String author = rs.getString(2);
   		String BookTitle = rs.getString(3);
   		String Genre = rs.getNString(4);
   		
   		System.out.printf("ID: %d, author: %s, bookTitle: %s %n, genre: %s %n", ID, author, BookTitle, Genre);
            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } 
            
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
		
	}

}
