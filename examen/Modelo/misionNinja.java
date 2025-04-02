package examen.Modelo;

public class misionNinja {
    private int id_misionN;
    private String fechaI;
    private String fechaF;
    private int id_ninja;
    private int id_mision;

    public misionNinja() {}

    public misionNinja(int id_misionN, String fechaI, String fechaF, int id_ninja, int id_mision) {
        this.id_misionN = id_misionN;
        this.fechaI = fechaI;
        this.fechaF = fechaF;
        this.id_ninja = id_ninja;
        this.id_mision = id_mision;
    }

    public misionNinja(int id_ninja,String fechaI) {
        this.id_misionN = id_ninja;
        this.fechaI = fechaI;

    }
    
    public misionNinja(int id_misionN) {
        this.id_misionN = id_misionN;
    }

    public misionNinja(String fechaF) {
        this.fechaF = fechaF;
    }

    
    public int getId_misionN() {
        return id_misionN;
    }

    public void setId_misionN(int id_misionN) {
        this.id_misionN = id_misionN;
    }

    public String getFechaI() {
        return fechaI;
    }

    public void setFechaI(String fechaI) {
        this.fechaI = fechaI;
    }

    public String getFechaF() {
        return fechaF;
    }

    public void setFechaF(String fechaF) {
        this.fechaF = fechaF;
    }

    public int getId_ninja() {
        return id_ninja;
    }

    public void setId_ninja(int id_ninja) {
        this.id_ninja = id_ninja;
    }

    public int getId_mision() {
        return id_mision;
    }

    public void setId_mision(int id_mision) {
        this.id_mision = id_mision;
    }

    public void buscar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void buscra() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
