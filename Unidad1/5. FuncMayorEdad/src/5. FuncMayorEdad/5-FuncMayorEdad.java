
package javaapplication13;
    
     import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame un numero: ");
        int numero;
        numero = entrada.nextInt();
        System.out.println(retornaMultiplo(numero));
    }
    public static String retornaMultiplo(int num){
        int mult3;
        int mult5;
        
        mult3= num % 3;
        mult5 = num % 5;
        
        if (mult3 == 0 && mult5 == 0) {
            return "TRIFIV";
        }else if (mult3 == 0) {
            return "Tri";
        }else if (mult5 == 0) {
            return "Fiv";
        }
        return "ningun caso";
    }


    
}
