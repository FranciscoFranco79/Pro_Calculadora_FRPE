/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ceti
 */
public class calculadora_FRPE {
    

    public static int porcentaje (int a, int b){
        return a%b;
    }

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
        
    public static int Suma_modificada(int a, int b, int c){
        
        return c+b+a;
    }
    
    public static void main(String args[])
    {
        System.out.println("La suma es: "+Suma(5,5));
        System.out.println("La resta es: "+Resta(5,5));
        System.out.println("La multiplicacion es: "+ Multiplicacion(2,4));
        System.out.println("La division es: "+ Division(2,4));
        
        System.out.println("El porcentaje es: " + porcentaje(10,100));
        System.out.println("La suma total es: " + Suma_modificada(3,4,5));
    }
   
}
