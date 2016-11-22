package QueryEngine;
import java.sql.*;
import DataBase.DBConnector;

public class Query {
	
	    static ResultSet Result;

		public static ResultSet Scalenie(String query) throws Exception {
			
		Result = DBConnector.runSql(query);				
		
		return Result;
		
		}
}

