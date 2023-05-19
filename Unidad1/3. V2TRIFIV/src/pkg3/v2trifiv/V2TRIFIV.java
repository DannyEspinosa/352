
package pkg3.v2trifiv;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author Daniel
 */
public class V2TRIFIV {

   
    public static void main(String[] args) throws IOException {
        int numero;
         int mult3;
         int mult5; 
         BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
         
         System.out.println("Dame un numero: ");
         numero = Integer.parseInt(bufEntrada.readLine());
         
         mult3 = numero % 3;
         mult5= numero % 5;
         
         if (mult3 == 0 && mult5 == 0) {
             System.out.println("TRIFIV");
        }else if (mult3 == 0) {
             System.out.println("TRI");
        }else if (mult5 == 0) {
             System.out.println("FIV");
        }

    }
    
}
