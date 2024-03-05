package capitulo3.exercicios.exercicio.Christian;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Christian Amsberg Janner <janner.chris15@outlook.com>
@date 04/03/2024
@brief Class Ex13
* **/
public class Ex13 {
    public static void main(String[] args) {
        System.out.println ("Entre com o valor de x: ");
        int x = new java.util.Scanner(System.in).nextInt();
        System.out.println ("Entre com o valor de y: ");
        int y = new java.util.Scanner(System.in).nextInt();
        
        int resultado = 1;
        
        for (int i=0; i<y; i++){
            resultado = resultado * x;
        }
        
        System.out.println(x + " elevado a " + y + " é " + resultado);
    }
}
