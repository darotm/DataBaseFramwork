package QueryEngine;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import DataBase.DBConnector;
import DataSource.Constants;

public class Query {

	try{
	String url = DataSource.Constants.url;
	String username = DataSource.Constants.user;
	String password = DataSource.Constants.password;
	String OraDriver = DataSource.Constants.OraDriver;
	
	
				
		
				
	} catch (Exception e1){
	
	e1.printStackTrace();
	
	}	
	
	try{
		
	//DBConnector sqlQuery = new DBConnector();
	DBConnector.DB(url, username, password, OraDriver);
			ResultSet rs = DBConnector.runSql("SELECT * FROM ");
			while(rs.next()){
				System.out.println(rs.getString("ELEMENT_ID"));
				}
	}catch (SQLException e){
		
		e.printStackTrace();
		
		
	}
		
	
}
}