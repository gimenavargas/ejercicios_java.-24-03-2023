/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // denominamos las dos variables "n" y "y"
        int n;
        int y;
        Scanner leer = new Scanner(System.in);
        System.out.print("Escribe el primer numero: ");
        n=leer.nextInt (); //n recoge el primer valor escrito por teclado
        System.out.print("Escribe el segundo numero: ");
        y=leer.nextInt (); //y recoge el segundo valor escrito por teclado
        
        if (n != y) //condicion si n es diferente que y
        {
            System.out.println("el numero "+n+" es diferente a "+y);
        }
        if (n < y) //condicion si n es menor que y
        {
            System.out.println("el numero "+n+" es menor que "+y);
        }
        if (n > y) //condicion si n es mayor que y
        {
            System.out.println("el numero "+n+" es mayor que "+y);
        }
        if(n <= y) //condicion si n es mayor o igual que y
        {
            System.out.println("el numero "+n+" es menor o igual que "+y);
          
        }
    }
    
    
}
