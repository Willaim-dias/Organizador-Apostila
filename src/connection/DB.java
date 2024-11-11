package connection;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import view.util.Alert;

public class DB {

    private static Connection conn = null;
    
    public static Connection getConnection() {
        File file = new File("SavePDF.db");

        if (file.exists()) {
            if (conn == null) {
                try {
                    conn = DriverManager.getConnection("jdbc:sqlite:SavePDF.db");
                    return conn;
                } catch (SQLException ex) {
                }
            } else {
                return conn;
            }
        } else {
            Alert.menssage("Banco de dados não encontrado", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
        return null;
    }

    public void closeConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
        }
    }

    public static void closeStatement(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
            }
        }
    }

    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
            }
        }
    }
    
}
