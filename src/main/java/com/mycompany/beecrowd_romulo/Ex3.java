/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.beecrowd_romulo;

/**
 *
 * @author Christian Amsberg Janner <janner.chris15@outlook.com>
@date 04/03/2024
@brief Class Ex3
* **/
import java.util.Scanner;
public class Ex3 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leia os valores de A e B
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Calcule a soma e armazene em SOMA
        int SOMA = A + B;

        // Imprima o resultado no formato desejado
        System.out.println("SOMA = " + SOMA);
    }
}
