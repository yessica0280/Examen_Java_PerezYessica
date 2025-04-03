package vista;

import java.util.List;
import java.util.Scanner;
import modelo.misionNinja;
import modelo.ninja;

public class Vista {
    Scanner scan = new Scanner(System.in);
    
    public void Mostrar(List<ninja> ninjas) {
        System.out.println("lista de ninjas: ");
        for (ninja n : ninjas) {
            System.out.println(n);
        }
    }
    
    public misionNinja agregarM() {
        System.out.println("Ingresa los datos para la nueva mision del ninja: ");
        System.out.println("Id ninja: ");
        int id = scan.nextInt();
        System.out.println("fecha de inicio: ");
        String fechaI = scan.nextLine();
        return new misionNinja(id, fechaI);
    }
    
    public void mostrarN(List<misionNinja> misionn) {
        System.out.println("Lista de las misiones que tiene el ninja: ");
        for (misionNinja m : misionn) {
            System.out.println(m);
        }
    }
    
    public misionNinja actualizar() {
        System.out.println("los nuevos datos: ");
        System.out.println("Id: ");
        int id = scan.nextInt();
        System.out.println("fecha finalizacion: ");
        String fechaf = scan.nextLine();
        return new misionNinja(id, fechaf);
    }
    
    public void ver(List<misionNinja> misiones) {
        System.out.println("Lista de las misiones completadas por el ninja: ");
        for (misionNinja mi : misiones) {
            System.out.println(mi);
        }
    }
}
