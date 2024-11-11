package model.entities;

public class Document {
    
    private Integer id;
    private String name;
    private String reference;
    private String description;
    private byte[] pdf;

    public Document() {
    }
    
    public Document(Integer id, String name, String reference, String description, byte[] pdf) {
        this.id = id;
        this.name = name;
        this.reference = reference;
        this.description = description;
        this.pdf = pdf;
    }

    public Document(Integer id, String name, String reference) {
        this.id = id;
        this.name = name;
        this.reference = reference;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getPdf() {
        return pdf;
    }

    public void setPdf(byte[] pdf) {
        this.pdf = pdf;
    }
  
}
