package examen.Controlador;

import examen.Modelo.Consultas;
import examen.Modelo.mision;
import examen.Modelo.misionNinja;
import examen.Modelo.ninja;
import examen.Modelo.misionNinja;
import examen.Vista.Vista;
import java.util.Scanner;

public class Controlador {
    private Consultas consultas;
    private Vista vista;
    private Scanner scan;
    
    public Controlador(Consultas consultas, Vista vista){
        this.consultas = consultas;
        this.vista = vista;
        this.scan = scan = new Scanner(System.in);
    }
    
    public void iniciar() {
        boolean salir = true;
        while (salir = true) {
            System.out.println("---- Menú principal ----");
            System.out.println("1. Listar todos los ninjas y sus habilidaes.");
            System.out.println("2. Mostrar misiones que tiene el ninja.");
            System.out.println("3. Mostrar las misiones que completo el ninja.");
            System.out.println("4. Marcar como completada una mision.");
            System.out.println("5. Mostrar misiones completadas.");
            System.out.println("6. Agregar una mision.");
            System.out.println("7. Salir.");
            int opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    ninja ninjas = new ninja();
                    ninjas.obtener();
                    break;
                    
                case 2:
                    misionNinja misionn = new misionNinja();
                    misionn.buscar();
                    break;
                    
                case 3: 
                    misionNinja miso = new misionNinja();
                    miso.buscra();
                    break;
                    
                case 4:
                    break;
                    
                case 5:
                    mision miss = new mision();
                    /*miss.buscar();*/
                    break;
                case 6:
                    misionNinja misioN = vista.agregarM();
                   /* consultas.agregar(misioN);
                    System.out.println(misionN);*/
                    break;
                    
                case 7:
                    System.out.println("Saliendo...");
                    salir = false;
                    break;
            }
        }
    }
}
