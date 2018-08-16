package HomeworkWeb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import HomeworkWeb.Operate.EditOperate;
import HomeworkWeb.Operate.ExtractOperate;
import HomeworkWeb.Operate.OperateDelete;
import HomeworkWeb.Operate.OperateInsert;

public class ConnectSql {
	
	    public static void main (String args []) {

	    	ExtractOperate ExOp = new ExtractOperate();   
	    	ExOp.ExtractLibrary();
	    	
                OperateInsert OIns = new OperateInsert ();
                OIns.InsertBook();
                
                OperateDelete OpDel = new OperateDelete ();
                OpDel.DeleteBook();
                
//                EditOperate EdOp = new EditOperate ();
//                EdOp.EditBook();
	        }
	    }
	   
 // }
