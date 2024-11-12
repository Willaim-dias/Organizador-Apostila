package model.Service;

import java.util.List;
import model.dao.DaoFactory;
import model.dao.DocumentDao;
import model.entities.Document;

public class DocumentService {
    
    private final DocumentDao dao = DaoFactory.createDocumentDao();
    
    public List<Document> findAll() {
        return dao.findAll();
    }
    
    public Document findById(int id) {
        return dao.findById(id);
    } 
    
    public void saveOrUpdate(Document obj) {
        if (obj.getId() == null) {
            dao.insert(obj);
        } else {
            //dao.update(obj);
        }
    }
    
    public void  remove(Integer id) {
        dao.deleteById(id);
    }
    
}
