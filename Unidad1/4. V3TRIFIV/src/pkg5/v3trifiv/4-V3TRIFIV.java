/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.v3trifiv;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class V3TRIFIV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Dame un numero: ");
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
        }else if (mult3==0) {
            return "Tri";
        }else if (mult5==0) {
            return "Fiv";
        }
        return "ningun caso";
    }
    }
    

