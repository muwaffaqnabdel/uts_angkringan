
package project_angkringan;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Koneksi {
    public static Connection Go(){
        try {
            MysqlDataSource m = new MysqlDataSource();
            m.setServerName("localhost"); 
            m.setDatabaseName("angkringan"); 
            m.setUser("root"); 
            m.setPassword(""); 
            m.setPortNumber(3306); 
            m.setServerTimezone("Asia/Jakarta"); 
            
            Connection C = m.getConnection();
//            System.out.println("Koneksi sukses");
            return C;
        } catch (SQLException e) {
            System.err.println("Koneksi Gagal!\n"+
                    e.getMessage());
        }
        
        
        return null;
    }
    public static void main(String[] args) {
        Connection conn = Go();
        if (conn != null) {
            System.out.println("Connection Successful");
        } else {
            System.out.println("Connection failed.");
        }
    }
    
    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    PreparedStatement prepareStatement(String Q) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
