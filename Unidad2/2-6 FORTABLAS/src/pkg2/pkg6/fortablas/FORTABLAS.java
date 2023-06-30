
package pkg2.pkg6.fortablas;

/**
 *
 * @author Daniel
 */
public class FORTABLAS {

  
    public static void main(String[] args) {
         int i,j;
     for(i=1; i<=10; i++){
         System.out.println("TABLA DEL " +i );
         System.out.println("-------------------");
         
         for( j=1; j<=10; j++){
             System.out.println(j + "x" + j + "=" + j*i);
         }
     }

    }
    
}
