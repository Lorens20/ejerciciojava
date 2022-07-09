/*
 * Un usuario de un banco tiene un sueldo de 1000 $,
ha hecho los siguientes gastos: 234$, 34.45$, 12,99$. 
Calcula cuál es su saldo final.
*/
package ejercicio3;
import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {
        float sueldo = Float.parseFloat(JOptionPane.showInputDialog(null,"por favor ingrese el sueldo: "));
        float gasto1 = Float.parseFloat(JOptionPane.showInputDialog(null,"por favor ingrese el gasto: "));
        sueldo -= gasto1;
        JOptionPane.showMessageDialog(null,"el saldo final es: "+sueldo);
        
        float gasto2 = Float.parseFloat(JOptionPane.showInputDialog(null,"por favor ingrese el gasto: "));
        sueldo -= gasto2;
        JOptionPane.showMessageDialog(null,"el saldo final es: "+sueldo);
        
        float gasto3 = Float.parseFloat(JOptionPane.showInputDialog(null,"por favor ingrese el gasto: "));
        sueldo -= gasto3;
        JOptionPane.showMessageDialog(null,"el saldo final: "+sueldo);
    
    }
    
    
}
