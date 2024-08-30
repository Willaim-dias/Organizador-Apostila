package model;

import Connection.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import view.ShowMessage;

public class GetData {

    ShowMessage message = new ShowMessage();

    public byte[] recuperarPDF(int id) {
        String sql = "SELECT PDF FROM PDFs WHERE ID = ?";     
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = DB.getConnection().prepareStatement(sql);
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                byte[] pdfBytes = rs.getBytes("PDF");
                return pdfBytes;
            }
        } catch (SQLException e) {
            message.aler("Error: "+e);
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
        }
        return null;
    }

    public List<Map<String, Object>> recuperarDatas() {
        String query = "SELECT ID,Nome_arquivo,Referencia FROM PDFs";
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = DB.getConnection().prepareStatement(query);

            rs = st.executeQuery();
            List<Map<String, Object>> result = new ArrayList<>();
            while (rs.next()) {
                Map<String, Object> row = new HashMap<>();
                row.put("id", rs.getString("ID"));
                row.put("nome_arquivo", rs.getString("Nome_arquivo"));
                row.put("referencia", rs.getString("Referencia"));
                result.add(row);
            }
            return result;

        } catch (SQLException e) {
            message.aler("Error: "+e);
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
        }
        return null;
    }

    public String[] getDetails(int id) {
        String query = "SELECT ID,Nome_arquivo,Referencia,Descricao FROM PDFs WHERE id = ?";
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = DB.getConnection().prepareStatement(query);
            st.setInt(1, id);
            rs = st.executeQuery();
            String[] data = new String[3];
            data[0] = rs.getString("Nome_arquivo");
            data[1] = rs.getString("Referencia");
            data[2] = rs.getString("Descricao");
            return data;
        } catch (SQLException e) {
            message.aler("Error: "+e);
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
        }
        return null;
    }
}
