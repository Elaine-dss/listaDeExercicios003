package br.com.zup;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Você deseja abastecer com álcool ou gasolina? ");
        String tipoDeCombustível = leitor.nextLine();
        System.out.print("Digite a quantidade de litros que deseja abastecer: ");
        double litros = leitor.nextDouble();

        double desconto = 0;
        double valorCombustivel = 0;
        double valorParaPagar = 0;

        if (tipoDeCombustível.equals("álcool") || tipoDeCombustível.equals("gasolina")){
            if(tipoDeCombustível.equals("álcool")){
                if (litros <= 20){
                    desconto = 0.03;
                }
                else {
                    desconto = 0.05;
                }
                valorCombustivel = 1.90;
            }
            else if(tipoDeCombustível.equals("gasolina")){
                if (litros <= 20){
                    desconto = 0.04;
                }
                else {
                    desconto = 0.06;
                }
                valorCombustivel = 2.50;
            }

            valorParaPagar = (valorCombustivel * litros) - (desconto * litros);

            System.out.printf("Você abasteceu %.2f litros de %s e ganhou desconto de %.0f%% \n", litros, tipoDeCombustível, desconto * 100);
            System.out.printf("Você deverá pagar %.2f no total", valorParaPagar);
        }
        else {
            System.out.println("Dados digitados incorretamente!");
        }
    }
}
