package capitulo3.exercicios.exercicio.Christian;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Christian Amsberg Janner <janner.chris15@outlook.com>
@date 04/03/2024
@brief Class Ex15
* **/
public class Ex15 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Entre com o valor para a posição [" + (i + 1) + "," + (j + 1) + "]: ");
                matriz[i][j] = new java.util.Scanner(System.in).nextInt();
            }
        }
        
        System.out.println("Diagonal Principal");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j){
                    for (int k=0; k < j; k++)
                        System.out.print("\t");
                    System.out.println( matriz[i][j] );
                }
            }
        }
        
    }
}
