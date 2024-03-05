package capitulo3.exercicios.exercicio.Christian;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Christian Amsberg Janner <janner.chris15@outlook.com>
@date 04/03/2024
@brief Class Ex09
* **/
public class Ex09 {
    public static void main(String[] args) {
        int lado1, lado2, lado3;
        
        System.out.println("Entre com o tamanho do primeiro lado: ");
        lado1 =  new java.util.Scanner(System.in).nextInt();
        
        System.out.println("Entre com o tamanho do segundo lado: ");
        lado2 =  new java.util.Scanner(System.in).nextInt();
        
        System.out.println("Entre com o tamanho do terceiro lado: ");
        lado3 =  new java.util.Scanner(System.in).nextInt();
        
        if (lado1 == lado2 && lado2 == lado3){
            System.out.println("Triangulo equilátero! ");
        }else{
            if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3){
                System.out.println("Triangulo escaleno! ");
            }else{
                System.out.println("Triangulo isósceles! ");
            }
        }
    }
}
