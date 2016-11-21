package DataBase;
import java.sql.*;
public class DBConnector {
	
	 public static  Connection connect = null; 
	 static String base = DataSource.Constants.base;
		
	 public static void DB(String url, String user_name, String password, String Oradriver){
	
				try{
						Class.forName(Oradriver);
						connect = DriverManager.getConnection(url + base, user_name, password);
				} catch (SQLException e){
				
					e.printStackTrace();
				} catch (ClassNotFoundException e){
					
					e.printStackTrace();
				}		
		
		
	 	}
	 
	 public static ResultSet runSql(String sql) throws SQLException {
			Statement sta = connect.createStatement(); 
			return sta.executeQuery(sql);
		}
}