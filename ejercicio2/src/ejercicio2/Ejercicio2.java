
package ejercicio2;

import javax.swing.JOptionPane;


public class Ejercicio2 {

    
    public static void main(String[] args) {
        //float nota1 = 5.25;
        //float nota2 = 7.85;   captura datos por consola
        //float nota3 =
     /*   double nota1, nota2, nota3, promedio;
        nota1 = 5.25d;
        nota2 = 7.85d;
        nota3 = 3.4d;
        
        promedio = (nota1+nota2+nota3)/3;
        
        promedio += 1; //promedio = promedio + 1
        
        System.out.println("El promedio de las notas es: " + promedio);*/
     // promedio de notas por ventana 
     
       
       
        float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota 1: "));
        float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota 2: "));
        float nota3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota 3: "));
        
        float promedio = (nota1+nota2+nota3)/3;
        
        promedio += 1; //promedio = promedio + 1
        
        JOptionPane.showMessageDialog(null, "El promedio de las notas es: " + promedio);
           
        
    }
    
}
