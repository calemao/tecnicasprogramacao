package capitulo3.exercicios.exercicio.Christian;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Christian Amsberg Janner <janner.chris15@outlook.com>
@date 04/03/2024
@brief Class Ex05
public class Ex05 {
**/

public class Ex05 {
    public static void main(String[] args) {
        float distancia, velocidade, tempo;
        
        System.out.println("Entre com a velocidade (km/h) do carro: ");
        velocidade = new java.util.Scanner(System.in).nextFloat();
        System.out.println("Entre com o tempo (horas) de viagem do carro: ");
        tempo = new java.util.Scanner(System.in).nextFloat();
        
        distancia = velocidade * tempo;
        
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Tempo de viagem: " + tempo + " horas");
        System.out.println("Distância percorrida: " + distancia + " km");
    }
}

