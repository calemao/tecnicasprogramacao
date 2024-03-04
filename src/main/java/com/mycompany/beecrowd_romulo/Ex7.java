/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.beecrowd_romulo;

/**
 *
 * @author Christian Amsberg Janner <janner.chris15@outlook.com>
@date 04/03/2024
@brief Class Ex7
* **/
import java.util.Scanner; 
public class Ex7 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int diferenca = (a * b) - (c * d);

        System.out.println("DIFERENCA = " + diferenca);
    }
}
