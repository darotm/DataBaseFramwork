package ODS.DataBaseFramework;
import DataBase.DBConnector;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String url = DataSource.Constants.url;
    	String username = DataSource.Constants.user;
    	String password = DataSource.Constants.password;
    	String OraDriver = DataSource.Constants.OraDriver;
    
    
    //DBConnector sqlQuery = new DBConnector();
  	DBConnector.DB(url, username, password, OraDriver);
  	
    }
}
