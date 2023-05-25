/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.funcmayoredad;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class FuncMayorEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int edad;
        System.out.println("Ingresa tu edad: ");
        edad = leer.nextInt();
        System.out.println(retornaEdad(edad));
        
        
    }
    public static String retornaEdad(int edad){
        if (edad < 18) {
            System.out.println("Eres menor de edad");
        }else{
            System.out.println("Eres Mayor de edad...");
        }
        return "";
    }
    }
    

