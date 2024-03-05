package capitulo3.exercicios.exercicio.Christian;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Christian Amsberg Janner <janner.chris15@outlook.com>
@date 04/03/2024
@brief Class Ex08
* **/
public class Ex08 {

    public static void main(String[] args) {
        int a, b, maior;
        System.out.println("Entre com o valor de A: ");
        a = new java.util.Scanner(System.in).nextInt();
        System.out.println("Entre com o valor de B: ");
        b = new java.util.Scanner(System.in).nextInt();
        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);
        maior = a > b ? a : b;
        System.out.println("Maior: " + maior);
    }
}