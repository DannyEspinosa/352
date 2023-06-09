
package pkg10.tipoclima;
    import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class TipoClima {
    static int clima = 0;
    
    public static void main(String[] args) {
       pedir();
       comprobar(clima);
    }
    public static void pedir(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la tempertura en centigrados: ");
        clima = entrada.nextInt();
    }
    public static void comprobar(int clima){
        if (clima<=10) {
            System.out.println("El clima es Frio");
        }else if (clima>10 && clima<=20) {
            System.out.println("El clima es Nublado");
        }else if (clima>20 && clima<=30) {
            System.out.println("El clima es Caluroso");
        }else if (clima>30) {
            System.out.println("El clima es Tropical");
        }
    }
    
}
