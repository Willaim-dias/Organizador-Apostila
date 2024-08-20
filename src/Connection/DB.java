package Connection;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import view.ShowMessage;

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
            ShowMessage message = new ShowMessage();
            message.information("Banco de dados não encontrado");
            System.exit(0);
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
