package capitulo3.exercicios.exercicio.Christian;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Christian Amsberg Janner <janner.chris15@outlook.com>
@date 04/03/2024
@brief Class Ex12
* **/
public class Ex12 {
    public static void main(String[] args) {
        System.out.println("Entre com o número para obter seu fatorial: ");
        int numero  =  new java.util.Scanner(System.in).nextInt();
        
        int fatorial = 1;
        int n = numero;
        while (n > 1){
            fatorial = fatorial * n;
            n--;
        }
        
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
