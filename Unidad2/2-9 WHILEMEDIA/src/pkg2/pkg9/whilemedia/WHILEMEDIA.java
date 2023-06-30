
package pkg2.pkg9.whilemedia;
    import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class WHILEMEDIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in);
   int num, suma, elementos;
   float media;
   
   System.out.println("INTRODUZCA UN NUMERO: ");
   num = entrada.nextInt();
   
   suma=0;
   elementos=0;
   while (num>=0){
       suma+= num;
       elementos ++;
       
       System.out.println("INTRODUCE OTRO NUMERO; ");
       num=entrada.nextInt();
       
   }
           media =(float)suma/elementos;
           System.out.println("LA MEDIA ES DE: "+ media);
    }
    
}
