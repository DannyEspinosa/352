
package pkg2.pkg1.switchcalificaciones;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class SwitchCalificaciones {


    public static void main(String[] args) {
         //definir variables
                Scanner entrada = new Scanner(System.in);
        int calificacion;
        
        //datos de entrada 
        System.out.println("introduzca la calificacion:");
        calificacion = entrada.nextInt();
        //proceso (operación matemática)
        //datos salida
        switch (calificacion){
            case 0:
            System.out.println ("MUY MAL");
            break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("INSUFICIENTE");
                break;
            case 6:
                System.out.println("SUFICIENTE");
                break;
            case 7:
            case 8:
                System.out.println("BIEN");
                break;   
            case 9:
                System.out.println("NOTABLE");
                break;
            case 10:
                System.out.println("SOBRESALIENTE");
                break;
            default:
                System.out.println("ERROR DE CAIFICACIÓN");
                break;
        }
    }
    
}
