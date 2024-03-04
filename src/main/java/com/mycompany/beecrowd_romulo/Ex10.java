/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.beecrowd_romulo;

/**
 *
 * @author Christian Amsberg Janner <janner.chris15@outlook.com>
@date 04/03/2024
@brief Class Ex10
* **/
import java.util.Scanner; 
public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int productCode1 = scanner.nextInt();
        int units1 = scanner.nextInt();
        double price1 = scanner.nextDouble();

        int productCode2 = scanner.nextInt();
        int units2 = scanner.nextInt();
        double price2 = scanner.nextDouble();

        double totalAmount = (units1 * price1) + (units2 * price2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalAmount);

        scanner.close();
    }

