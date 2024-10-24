
package ejercicio;

import java.util.Scanner;

public class empleado {
    String nombre, apellido, cargo;
    int identificacion; 
    
    public void registroDatos(){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Registre el nombre del empleado: ");
        nombre= sc.next();
        System.out.println("Registre el apellido del empleado: ");
        apellido= sc.next();
        System.out.println("Registre la identificacion del empleado: ");
        identificacion= sc.nextInt();
        System.out.println("Registre el cargo del empleado: ");
        cargo= sc.next();
    }
    
    public void imprimirDatos(){
        
        System.out.println("El nombre del emplado es: "+nombre);
        System.out.println("El apellido del emplado es: "+apellido);
        System.out.println("La identificacion del emplado es: "+identificacion);
        System.out.println("El cargo del emplado es: "+cargo);
    }
}
