/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ceti
 */
public class calculadora_FRPE {
    
    public static int Suma(int a, int b){
        return a+b;
     
    }
        public static int Resta(int a, int b){
        return a-b;
    }

    public static int Multiplicacion(int a, int b) {
        return a*b;
    }
    public static int Division(int a, int b) {
        return a/b;
    }

    /**f
     * @param args the command line arguments
     */
    
    public static void main(String args[])
    {
        System.out.println("La suma es: "+Suma(5,5));
        System.out.println("La resta es: "+Resta(5,5));
        System.out.println("La multiplicacion es: "+ Multiplicacion(2,4));
        System.out.println("La division es: "+ Division(2,4));
    }
}
