package model;

import Connection.DB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import view.ShowMessage;

public class DeleteData {

    public void removePDF(int id) {
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement("DELETE FROM PDFs WHERE ID = ?", Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            messageReturn(ps.executeUpdate());
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }
 
    private void messageReturn(int resp) {
        ShowMessage message = new ShowMessage();
        if (resp > 0) {
            message.information("Deletado com Salvo!");
        } else {
            message.information("Erro ao Deletar Arquivo!");
        }
    }
}


