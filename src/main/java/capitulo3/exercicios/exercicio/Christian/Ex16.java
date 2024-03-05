/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Christian Amsberg Janner <janner.chris15@outlook.com>
@date 05/03/2024
@brief Class Ex16
* **/
public class Ex16 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Entre com o valor para a posição [" + (i + 1) + "," + (j + 1) + "]: ");
                matriz[i][j] = new java.util.Scanner(System.in).nextInt();
            }
        }
        
        System.out.println("Diagonal Secundária");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i+j == (3-1)){
                    for (int k=j; k > 0; k--)
                        System.out.print("\t");
                    System.out.println( matriz[i][j] );
                }
            }
        }
        
    }
}
