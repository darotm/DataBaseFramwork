package DataBase;
import java.sql.*;
public class DBConnector {
	
	 public static  Connection connect = null; 
	 	
	 public static void DB(String url, String user_name, String password, String OraDriver){
	
				try{
						Class.forName(OraDriver);         
						connect = DriverManager.getConnection(url,user_name, password); 
						System.out.println("Connection established");
				} catch (SQLException e){
				
					e.printStackTrace();
				} catch (ClassNotFoundException e){
					
					e.printStackTrace();
					System.out.println("Bład DB");
				}		
					
	}
	 
	 public static void closeConnection() throws Exception {
			if (connect != null && !connect.isClosed()) {
				connect.close();
				System.out.println("Connection closed");
			}
	 }
	 
	 public static ResultSet runSql(String sql) throws SQLException {
			Statement sta = connect.createStatement(); 
			return sta.executeQuery(sql);
		}
}