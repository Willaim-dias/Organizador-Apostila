package model.dao;

import connection.DB;
import model.jdbc.DocumentJDBC;

public class DaoFactory {
    
    public static DocumentDao createDocumentDao() {
        return new DocumentJDBC(DB.getConnection());
    }
    
}
