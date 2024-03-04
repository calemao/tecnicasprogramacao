/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.beecrowd_romulo;

/**
 *
 * @author Christian Amsberg Janner <janner.chris15@outlook.com>
@date 04/03/2024
@brief Class Ex6
* **/
import java.util.Scanner;
public class Ex6 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double pesoA = 2.0;
        double pesoB = 3.0;
        double pesoC = 5.0;

        double media = (a * pesoA + b * pesoB + c * pesoC) / (pesoA + pesoB + pesoC);

        System.out.printf("MEDIA = %.1f\n", media);
    }
}
