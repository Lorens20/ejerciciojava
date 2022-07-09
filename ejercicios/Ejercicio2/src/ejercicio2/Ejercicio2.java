/*
 * Un alumno tiene las siguientes notas en los exámenes: 5.25, 7.85, 3.4 
Calcula cual es la media de este trimestre. A parte todos los alumnos reciben
1 punto más a la media por un trabajo que hicieron, muestra por pantalla su nota final.
*/
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Por favor digite la nota: ");
        float nota = ingreso.nextFloat();
        
        System.out.println("Por favor digite la nota: ");
        float nota2 = ingreso.nextFloat();
        
        System.out.println("Por favor digite la nota: ");
        float nota3 = ingreso.nextFloat();
        
        
        float promedio = (nota+nota2+nota3)/3;
        
        promedio +=1;
        
        System.out.println("el resultado es: "+ promedio);

    }
    
}
