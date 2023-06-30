
package pkg2.pkg5.whilefordo;

/**
 *
 * @author Daniel
 */
public class WHILEFORDO {

   
    public static void main(String[] args) {
         System.out.println("nueros del 1 al 100");
        int i=1;
        while (i<=100){
            System.out.println(i);
            i++;
        }
    int j=i;
    do{
        System.out.println(j);
        j++;
        
    }while (j<=100);
    
    System.out.println("nueros del 1 al 100 con FOR");
        for(int k=1; k<100; k++){
            System.out.println(k);
            
        }
    }
    
}
