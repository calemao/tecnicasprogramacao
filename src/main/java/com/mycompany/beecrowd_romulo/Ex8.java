/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.beecrowd_romulo;

/**
 *
 * @author Christian Amsberg Janner <janner.chris15@outlook.com>
@date 04/03/2024
@brief Class Ex8
* **/
import java.util.Scanner;
public class Ex8 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeeNumber = scanner.nextInt();
        int workedHours = scanner.nextInt();
        double hourlyRate = scanner.nextDouble();

        double salary = workedHours * hourlyRate;

        System.out.printf("NUMBER = %d\n", employeeNumber);
        System.out.printf("SALARY = U$ %.2f\n", salary);

        scanner.close();
    }
}
