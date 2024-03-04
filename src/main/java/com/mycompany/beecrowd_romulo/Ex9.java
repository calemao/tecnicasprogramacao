/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.beecrowd_romulo;

/**
 *
 * @author Christian Amsberg Janner <janner.chris15@outlook.com>
@date 04/03/2024
@brief Class Ex9
* **/
import java.util.Scanner;
public class Ex9 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sellerName = scanner.nextLine();
        double fixedSalary = scanner.nextDouble();
        double totalSales = scanner.nextDouble();

        double totalSalary = fixedSalary + (totalSales * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", totalSalary);

        scanner.close();
    }
}
