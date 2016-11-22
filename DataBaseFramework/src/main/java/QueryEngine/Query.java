package QueryEngine;

import java.sql.*;
import DataBase.DBConnector;

public class Query {
	
		static String scalenieResult;

		public static String Scalenie(String query) throws Exception {
			
			ResultSet rs = DBConnector.runSql(query);
			while(rs.next()){
					System.out.println(rs.getString("ELEMENT_ID"));
					scalenieResult = rs.getString("ELEMENT_ID");
			}
	
	return scalenieResult;
	
}
}

