/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.beecrowd_romulo;

/**
 *
 * @author Christian Amsberg Janner <janner.chris15@outlook.com>
@date 04/03/2024
@brief Class Ex5
* **/
import java.util.Scanner;
public class Ex5 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        double weightA = 3.5;
        double weightB = 7.5;

        double MEDIA = (A * weightA + B * weightB) / (weightA + weightB);

        System.out.printf("MEDIA = %.5f\n", MEDIA);
    }
}
