/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo061 {

    static int suma = 0; // variable de alcance  global
    // se la puede usar e cualquier método
    // hemos declarado la variable statica
    // porque estamos usando método staticos

    public static void main(String[] args) {
        // 

        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};

        imprimirdatos(informacion);
          
    }
    public static void imprimirdatos(int[][] valor) {
        for (int i = 0; i < valor.length; i++) {
            for (int j = 0; j < valor[i].length; j++) {

                int numero = valor[i][j];
                if (numero % 2 == 0) {
                    System.out.printf("El numero par es: %d\n", numero);

                }

            }

        }
    }

}
