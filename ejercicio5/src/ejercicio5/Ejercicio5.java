/*
!a calificaci)n final de un estudiante de 6nform*tica y ;rogramaci)n se calcula 
con base a lascalificaciones de cuatro aspectos de su rendimiento acad5mico0 
participaci)n& primer e<amen parcial& segundo e<amen parcial y e<amen final.abiendo 
que las calificaciones anteriores entran a la calificaci)n final con ponderaciones 
del 10% 25%,25% y 40%(+& diseñar y codificar un algoritmo que calcule e imprima la
calificaci)n finalobtenida por un estudiante
 */
package ejercicio5;

import java.util.Scanner;
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        float participacion,primerExa,segundoEx,examenF,notaFinal;
        //pedir los datos necesarios
        
        System.out.print("Digite la nota de participacion: " );
        participacion=entrada.nextFloat();
        System.out.print("Digite la nota del primer examen parcial: ");
        primerExa=entrada.nextFloat();
        System.out.print("Digite la nota del segundo parcial: ");
        segundoEx=entrada.nextFloat();
        System.out.print("Digite la nota del examen final:");
        examenF=entrada.nextFloat();
        
        participacion *=0.10f;
        primerExa *=0.25f;
        segundoEx *=0.25f;
        examenF *= 0.40f;
        
        notaFinal =participacion +primerExa + segundoEx + examenF;
        
        System.out.println("la nota final es: "+ notaFinal);
    }
    
}
