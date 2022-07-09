/*Una compañía de venta de carros usados, paga a su personal de ventas un salario 
de $1000 mensuales , mas comisiones de $150 por cada carro vendido, mas el 5% del valor de la venta por carro.
Cada mes el capturista de la empresa  ingresa en la computadora los datos pertinentes.
hacer un programa que calcule e imprima el salario mensual de un vendedor dado

*/
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

   
    public static void main(String[] args) {
         //Constantes
        final float salario=1000, comision=150;
        //Variables
        //el porcentaje es de 5% de valor de la venta
        float salarioM,comisionT,valorC,total;
        int carrosvendidos;
        Scanner teclado= new Scanner (System.in);
        //Por el momento solo se venderan carros con el mismo valor
        //en un futuro, cambiar para que sean carros de diferentes precios.
        
        System.out.println("cuantos carros vendidos en el mes? :");
        carrosvendidos=teclado.nextInt();
        System.out.println("Costo de los carros? :");
        valorC=teclado.nextFloat();
        
        comisionT=(float)((carrosvendidos * valorC)*.05);
        total=comision*carrosvendidos;
        salarioM=salario+(comision*carrosvendidos)+comisionT;
        
         System.out.println("La comision por " + carrosvendidos + " carros vendidos es: " + "$" + total);
        System.out.println("+ el 5% del total de la venta es: "  + comisionT);
        System.out.println("El salario total es: "  + salarioM);
        
    }
    
}
