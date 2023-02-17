/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manos.a.la.obra.p4;

import Entidades.Dni;
import Entidades.Persona;

/**
 *
 * @author droa
 */
public class ManosALaObraP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona();
        p1.setNombre("Daniel");
        p1.setApellido("Roa");
//        Dni d1 = new Dni();
//        d1.setSerie('X');
//        d1.setNumero("83.578.636");
        
        p1.setDni(new Dni ('X',"83.578.636"));
        
        System.out.println(p1.toString());
    }
    
}
