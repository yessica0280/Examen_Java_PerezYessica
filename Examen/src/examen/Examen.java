package examen;

import controlador.controlador;
import modelo.consultas;
import modelo.ninja;
import vista.Vista;
import java.sql.*;

public class Examen {

    public static void main(String[] args) {
        ninja Nin = new ninja();
        Vista vistas = new Vista();
        consultas Consulta = new consultas();
        controlador Controlador = new controlador(Consulta, vistas);
        Controlador.iniciar();
    }
    
}
