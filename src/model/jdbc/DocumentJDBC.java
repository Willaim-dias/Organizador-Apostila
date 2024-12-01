package model.jdbc;

import connection.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.dao.DocumentDao;
import model.entities.Document;
import view.util.Alert;

public class DocumentJDBC implements DocumentDao {

    private Connection conn;

    public DocumentJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Document obj) {
        String sql = "INSERT INTO PDFs(Nome_arquivo,Referencia,Descricao,PDF) VALUES(?,?,?,?)";
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, obj.getName());
            st.setString(2, obj.getReference());
            st.setString(3, obj.getDescription());
            st.setBytes(4, obj.getPdf());
            int line = st.executeUpdate();

            if (line > 0) {
                Alert.menssage("Salvo com sucesso", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            Alert.menssage("Erro ao inserir" + e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        } finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public void update(Document obj) {

    }

    @Override
    public void deleteById(Integer id) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("DELETE FROM PDFs WHERE ID = ?", Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            Alert.menssage("Erro ao deletar", "Erro", JOptionPane.WARNING_MESSAGE);
        } finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public Document findById(Integer id) {
        String sql = "SELECT * FROM PDFs WHERE ID = ?";
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(sql);
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                Document document = new Document(rs.getInt("ID"), rs.getString("Nome_arquivo"), rs.getString("Referencia"), rs.getString("Descricao"), rs.getBytes("PDF"));
                return document;
            }
        } catch (SQLException e) {
            Alert.menssage("Erro ao carregar o pdf", "Erro", JOptionPane.WARNING_MESSAGE);
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
        }
        return null;
    }

    @Override
    public List<Document> findAll() {
        String query = "SELECT ID,Nome_arquivo,Referencia FROM PDFs";
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = DB.getConnection().prepareStatement(query);

            rs = st.executeQuery();
            List<Document> result = new ArrayList<>();
            while (rs.next()) {
                Document doc = new Document(rs.getInt("ID"), rs.getString("Nome_arquivo"), rs.getString("Referencia"));
                result.add(doc);
            }
            return result;
        } catch (SQLException e) {
            Alert.menssage(e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
        }
        return null;
    }

}
