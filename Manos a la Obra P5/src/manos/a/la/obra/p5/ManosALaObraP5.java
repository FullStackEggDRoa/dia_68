/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manos.a.la.obra.p5;

import Entidades.Equipo;
import Entidades.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class ManosALaObraP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Equipo eq1 = new Equipo();
        
        ArrayList <Jugador> jugadores = new ArrayList<>();
        
        jugadores.add(new Jugador("Moisés","Ramírez","Portero",12));
        jugadores.add(new Jugador("Hernán","Galíndez","Portero",1));
        jugadores.add(new Jugador("Alexander","Domínguez","Portero",22));
        jugadores.add(new Jugador("Piero","Hincapié","Defensa Central",3));
        jugadores.add(new Jugador("Félix","Torres","Defensa Central",2));
        jugadores.add(new Jugador("william","Pacho","Defensa Central",6));
        jugadores.add(new Jugador("Jackson","Porozo","Defensa Central",25));
        jugadores.add(new Jugador("Robert","Arboleda","Defensa Central",4));
        jugadores.add(new Jugador("Xavier","Arreaga","Defensa Central",14));
        jugadores.add(new Jugador("Pervis","Estupiñan","Lateral Izquierdo",7));
        jugadores.add(new Jugador("Diego","Palacios","Lateral Izquierdo",18));
        jugadores.add(new Jugador("Angelo","Preciado","Lateral Derecho",17));
        jugadores.add(new Jugador("Carlos","Gruezo","Pivote",8));
        jugadores.add(new Jugador("Jhegson","Méndez","Pivote",20));
        jugadores.add(new Jugador("Moises","Caicedoo","Mediocentro",23));
        jugadores.add(new Jugador("José","Cifuentes","Mediocentro",5));
        
        eq1.setJugadores(jugadores);
        
        System.out.println(eq1.toString().replace(",", ""));
        
    }
    
}
