
package pkg2.pkg10.doacomuladores;
    import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class DOACOMULADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada= new Scanner (System.in);
        int num,suma;
        suma=0;
        do{
            System.out.println("INTRODUZCA EL NUMERO: ");
            num = entrada.nextInt();
            suma= suma +num;
        }while (num!=0);
        System.out.println("LA SUMA DE TODOS ES:"+ suma);
    }
    
}
