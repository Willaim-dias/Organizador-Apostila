package model;

import Connection.DB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import view.ShowMessage;

public class DeleteData {

    private static final ShowMessage message = new ShowMessage();
    
    public void removePDF(int id) {
        PreparedStatement st = null;
        try {
            st = DB.getConnection().prepareStatement("DELETE FROM PDFs WHERE ID = ?",Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, id);
            messageReturn(st.executeUpdate());
        } catch (SQLException e) {
          message.aler("Error: "+e);
        } finally {
            DB.closeStatement(st);
        }
    }
 
    private void messageReturn(int resp) {
        if (resp > 0) {
            message.information("Deletado com Salvo!");
        } else {
            message.information("Erro ao Deletar Arquivo!");
        }
    }
}


