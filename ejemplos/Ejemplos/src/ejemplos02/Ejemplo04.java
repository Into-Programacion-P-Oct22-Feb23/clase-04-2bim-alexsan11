/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo04 {

    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        String opcion;
        System.out.println("desea ver la siguiente suma");
        opcion = entrada.nextLine();
        
        if (opcion.equals("si")){
            obtenerSuma(10, 30);
        }else{
            System.out.println("gracias por entender");
        }
        //obtenerSuma(10, 30); // se invoca al método (procedimiento) obtenerSuma
        
    }
        
    public static void obtenerSuma(int a, int b){
        int suma;
        suma = a + b;
        System.out.printf("El valor de la suma es: %d\n", suma);
        
    }
    
    
}
