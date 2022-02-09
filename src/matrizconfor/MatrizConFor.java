package matrizconfor;

import java.util.Scanner;

public class MatrizConFor {

    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        Scanner teclado = new Scanner(System.in);
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese el valor para la fila " + f + " columna " + c);
                matriz[f][c] = teclado.nextInt();
                 
            }
        }
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("El valor en la coordenada (" + f + ","+c+") es" + matriz[f][c]);
                
                 
            }
        }
    }
}
