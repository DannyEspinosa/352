package trifiv;

    import java.util.Scanner;

public class TriFiv {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingresa un numero: ");
        num = leer.nextInt();
        
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("TriFiv");
        }else if(num % 3 == 0){
            System.out.println("Tri");
    }else if (num % 5 == 0) {
            System.out.println("Fiv");
        }else{
            System.out.println("El numero no es multiplo de 3 ni de 5");
    }
    }
    
}
