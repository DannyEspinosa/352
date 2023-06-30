
package pkg2.pkg2.switchdescuentos;
    import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Daniel
 */
public class SwitchDescuentos {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        // Obtener el precio del producto.
        
        System.out.println("Introduzca el precio del producto:");
        String precio = scanner.nextLine();
        
        // Obtener el código de descuento del usuario.
        
        System.out.println("Introduzca el descuento:");
        String códigodescuento = scanner.nextLine();
        
       // se calcula el descuento.
        double descuento = 0;
        switch (códigodescuento) {
            case "10":
                descuento = 10;
                break;
            case "20":
                descuento = 20;
                break;
            case "30":
                descuento = 30;
                break;
            case "40":
                descuento = 40;
                break;
            case "50":
                descuento = 50;
                break;  
            case "60":
                descuento = 60;
                break;
            case "70":
                descuento = 70;
                break;
            case "80":
                descuento = 80;
                break;
            case "90":
                descuento = 90;
                break;
            case "100":
                descuento = 100;
                break;
            default:
                System.out.println("no existe descuento");
        }
        // se imprime el descuento.
        System.out.println("su descuento es del: " + descuento + "%. Bonita Tarde");
    
    }
    
}
