import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 * author solid
 */
public class koneksi {
    private static Connection koneksi;
    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/db_login";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            } catch (SQLException t) {
                JOptionPane.showMessageDialog(null, t);
            }
        } return koneksi;
    } static object getConnection() {
        try {
            throw new Unsupporttedoperationexception("Not yet implemented");
        } catch (Unsupporttedoperationexception ex) {
            Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (null);
    }

    private static class Unsupporttedoperationexception extends Exception {

        public Unsupporttedoperationexception(String not_yet_implemented) {
        }
    }
}