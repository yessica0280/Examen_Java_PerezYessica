package examen.Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class Consultas {
    private String url = "jdbc:mysql://buvh8jhkny2ode9dagxm-mysql.services.clever-cloud.com:3306/buvh8jhkny2ode9dagxm";
    private String usuario = "u2zpxdffk3kcllvk";
    private String password = "U9SFsyDkNq9N9oxI5VrW";
    
    private Connection conectar() throws SQLException {
        return DriverManager.getConnection(url, usuario, password);
    }
    
    /*Listar todos los nijas*/
    public List<String> obtener() {
        String sql = ""
                + "select n.*, h.nombre from ninja n inner join habilidaes h on h.nombre where id_ninja=?";
        List<String> listaNinja = new ArrayList<>();
        try (Connection conexionInterna = conectar();
                PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
                ResultSet resultado = solicitud.executeQuery();){
            while(resultado.next()) {
                listaNinja.add(resultado.getInt("id") + " - "
                + resultado.getString("nombre") + " - "
                + resultado.getString("rango") + " - " 
                + resultado.getString("aldea"));
            }
        }
        catch (SQLException e) {
            System.out.println("Error al leer los datos");
            e.printStackTrace();
        }
        return listaNinja;
    }
    
    /*Buscar mision con el ninja*/
    public void buscar(mision mis) {
        String sql = "select m.id_mision, n.id_ninja, n.nombre from mision m inner join ninja n on n.id_ninja where id_mision=?";
        try (   Connection conexionInterna = conectar();
                PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
                ResultSet resultado = solicitud.executeQuery()){
            while (resultado.next()) {
                int id = resultado.getInt("id");
                System.out.println("id: " + mis.getId_mision());
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    /*mision completa por ninja*/
    public void buscra(misionNinja misi) {
        String sql = "select m.*, n.id_ninja, n.nombre from misionNinja m inner join ninja n on m.id_misionN where id_ninja=?";
        try (   Connection conexionInterna = conectar();
                PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
                ResultSet resultado = solicitud.executeQuery()){
            while (resultado.next()) {
                int id = resultado.getInt("id");
                System.out.println("id: " + misi.getId_misionN());
                String fechaI = resultado.getString("fecha inicio");
                System.out.println("fecha inicio" + misi.getFechaI());
                String fechaF = resultado.getString("fecga finalizacion");
                System.out.println("fecha finalizacion" + misi.getFechaF());
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
    /*agregar mision*/
    public void agregar(mision mi) {
        String sql = "insert into mision(descripcion, rango, recompensa) values (?, ?, ?)";
        try (   Connection conexionInterna = conectar();
                PreparedStatement solicitud = conexionInterna.prepareStatement(sql)) {
            
            solicitud.setString(1, mi.getDescripcion());
            solicitud.setString(2, mi.getRango());
            solicitud.setString(3, mi.getRecompensa());
            
            solicitud.executeUpdate();
            System.out.println("Mision agregada con exito");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    /*marcar como completa*/
    public void marcar(misionNinja Mis) {
        String sql = "update misionNinja set fechaF=? where id_misionN=?";
        try (   Connection conexionInterna = conectar();
                PreparedStatement solicitud = conexionInterna.prepareStatement(sql)) {
            
            solicitud.setString(1, Mis.getFechaF());
            solicitud.setInt(2, Mis.getId_misionN());
            
            int filas = solicitud.executeUpdate();
            if (filas > 0) {
                System.out.println("Mision completada con exito");
            }
            else {
                System.out.println("No has terminado la mison" + Mis.getFechaF());
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
