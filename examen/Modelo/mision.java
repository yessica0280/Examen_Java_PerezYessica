package examen.Modelo;

public class mision {

    public static void agregar(String desc, String ran, String re) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private int id_mision;
    private String descripcion;
    private String rango;
    private String recompensa;

    public mision() {}

    public mision(int id_mision, String descripcion, String rango, String recompensa) {
        this.id_mision = id_mision;
        this.descripcion = descripcion;
        this.rango = rango;
        this.recompensa = recompensa;
    }

    public int getId_mision() {
        return id_mision;
    }

    public void setId_mision(int id_mision) {
        this.id_mision = id_mision;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(String recompensa) {
        this.recompensa = recompensa;
    }
}
