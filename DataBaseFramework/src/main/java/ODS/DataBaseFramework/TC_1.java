package ODS.DataBaseFramework;
import DataBase.DBConnector;
import QueryEngine.Query;

/**
 * Hello world!
 *
 */
public class TC_1 
{
    public static void main( String[] args ) throws Exception
    {
    	String url = DataSource.Constants.url;
    	String user_name = DataSource.Constants.user;
    	String password = DataSource.Constants.password;
    	String OraDriver = DataSource.Constants.OraDriver;
    
    
    //DBConnector sqlQuery = new DBConnector();
  	DBConnector.DB(url, user_name, password, OraDriver);
  	
  	Query.Scalenie("SELECT * FROM ODS_CORE.SELLING_STRUCTURE");
  	
  	
  	
  	DBConnector.closeConnection();
    }
}
