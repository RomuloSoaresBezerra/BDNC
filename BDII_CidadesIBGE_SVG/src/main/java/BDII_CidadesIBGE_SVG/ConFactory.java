package BDII_CidadesIBGE_SVG;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConFactory {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");
        
        String url = "jdbc:postgresql://localhost:5433/IBGE";
        Properties prop = new Properties();
        prop.setProperty("user", "postgres");
        prop.setProperty("password", "postgres");
       
        return DriverManager.getConnection(url, prop);
    }
}
