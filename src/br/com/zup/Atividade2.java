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

        if (tipoDeCombustível.equals("álcool") | tipoDeCombustível.equals("gasolina")){

            if(tipoDeCombustível.equals("álcool")){

                valorCombustivel = 1.90;

                if (litros <= 20 & litros > 0){
                    desconto = 0.03;
                }
                else if(litros > 20) {
                    desconto = 0.05;
                }
                else{
                    System.out.println("\nPor favor, insira um valor maior que zero!");
                }
            }
            else if(tipoDeCombustível.equals("gasolina")){

                valorCombustivel = 2.50;

                if (litros <= 20 & litros > 0){
                    desconto = 0.04;
                }
                else if (litros > 20){
                    desconto = 0.06;
                }
                else{
                    System.out.println("\nPor favor, insira um valor maior que zero!");
                }
            }

            double valorTotal = valorCombustivel * litros;
            double valorParaPagar = valorTotal - (desconto * litros * valorCombustivel);

            if (litros > 0){
                System.out.printf("\nVocê abasteceu %.2f litros de %s e ganhou desconto de %.0f%% \n", litros, tipoDeCombustível, desconto * 100);
                System.out.printf("O valor total seria de R$ %.2f. Com o desconto você pagará R$ %.2f no total!\n", valorTotal, valorParaPagar);
            }
        }
        else {
            System.out.println("\nDados digitados incorretamente!\nInforme se deseja álcool ou gasolina!");
        }
    }
}
