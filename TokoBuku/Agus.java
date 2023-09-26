package projectBaru;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author agus
 */
public class Agus {
    public static final String NAMA = "Agus";
    public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DBCONNECTION = "jdbc:mysql://localhost:3306/tokobuku";
    public static final String DBUSER = "root";
    public static final String DBPASS = "";
    
    public static Connection db() {
        try {
            Class.forName(DBDRIVER);
            return DriverManager.getConnection(DBCONNECTION,DBUSER,DBPASS);
        }catch(Exception e) {
            return null;
        }

    }

}
