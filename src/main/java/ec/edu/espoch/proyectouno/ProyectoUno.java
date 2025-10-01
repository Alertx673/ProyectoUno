/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.proyectouno;

/**
 *
 * @author gsupe
 */
public class ProyectoUno {

    public static void main(String[] args) {
        Estudiante estudianteUno = new Estudiante();
        estudianteUno.nombre="Pedro";
        estudianteUno.identificacion=225011;
        estudianteUno.promedio=30;
        
        System.out.println("Nombre: "+estudianteUno.nombre);
        System.out.println("Identificacion: "+estudianteUno.identificacion);
        System.out.println("Promedio: "+estudianteUno.promedio);
        
        System.out.println("");
        
        
        Estudiante estudianteDos = new Estudiante();
        estudianteDos.nombre="Alex";
        estudianteDos.identificacion=335011;
        estudianteDos.promedio=70;
        
        System.out.println("Nombre: "+estudianteDos.nombre);
        System.out.println("Identificacion: "+estudianteDos.identificacion);
        System.out.println("Promedio: "+estudianteDos.promedio);
        
        System.out.println("");

        Estudiante estudianteTres = new Estudiante();
        estudianteTres.nombre="Juan";
        estudianteTres.identificacion=445011;
        estudianteTres.promedio=60;
        
        System.out.println("Nombre: "+estudianteTres.nombre);
        System.out.println("Identificacion: "+estudianteTres.identificacion);
        System.out.println("Promedio: "+estudianteTres.promedio);
        
        System.out.println("");
        

    }
    

    
    
    
}

