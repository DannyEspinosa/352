
package pkg2.v1trifiv;

    import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
    
/**
 *
 * @author Daniel
 */
public class V1TRIFIV {

    
    public static void main(String[] args) throws IOException {
         int numero;
         int mult3;
         int mult5; 
         BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
         
         System.out.println("Dame un numero: ");
         numero = Integer.parseInt(bufEntrada.readLine());
         
         mult3 = numero % 3;
         mult5= numero % 5;
         
         if (mult3 == 0) {
             System.out.println("Tri");
            
        }
         if (mult5 == 0) {
             System.out.println("Fiv");
            
        }
         if (mult3 == 0 && mult5 == 0) {
             System.out.println("TriFiv");
            
        }
    }
    
}
