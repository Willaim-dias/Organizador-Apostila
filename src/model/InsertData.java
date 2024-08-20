package model;

import Connection.DB;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import view.ShowMessage;

public class InsertData {

    ShowMessage message = new ShowMessage();

    private byte[] lerArquivoPDF(String Filepath) {
        File file = new File(Filepath);
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] buffer = new byte[(int) file.length()];
            fis.read(buffer);
            return buffer;
        } catch (IOException e) {
            message.aler("Erro ao converter codigo-4: " + e);
        }
        return null;
    }

    public void inserirPDF(String name, String Reference, String description, String Filepath) {
        String sql = "INSERT INTO PDFs(Nome_arquivo,Referencia,Descricao,PDF) VALUES(?,?,?,?)";
        PreparedStatement st = null;
        try {
            st = DB.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, name);
            st.setString(2, Reference);
            st.setString(3, description);
            st.setBytes(4, lerArquivoPDF(Filepath));
            messageReturn(st.executeUpdate());
        } catch (SQLException e) {
            message.aler("Erro ao Salvar codigo-1: " + e);
        }
    }

    private void messageReturn(int resp) {
        if (resp > 0) {
            message.information("Salvo Com Sucesso!");
        } else {
            message.information("Erro ao Salvo!");
        }
    }
}
