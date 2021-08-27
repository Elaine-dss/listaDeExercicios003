package br.com.zup;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor que você ganha por hora trabalhada: ");
        double ganhoPorHora = leitor.nextDouble();
        System.out.print("Digite quantas horas você trabalhou neste mês: ");
        double horasTrabalhadas = leitor.nextDouble();

        double salarioBruto = ganhoPorHora * horasTrabalhadas;

        double valorFGTS = 0.11;

        double descontoINSS = 0.1;
        double descontoIR = 0;

        if (ganhoPorHora > 0 & horasTrabalhadas > 0){

            if(salarioBruto > 900 & salarioBruto <= 1500){
                descontoIR = 0.05;
            }
            else if(salarioBruto <= 2500){
                descontoIR = 0.1;
            }
            else {
                descontoIR = 0.2;
            }

            double totalDeDescontos = (descontoINSS * salarioBruto) + (descontoIR * salarioBruto);
            double salarioLiquido = salarioBruto - totalDeDescontos;

            System.out.printf("Salário Bruto: (%.2f * %.0f)\t\t\t\t: R$ %.2f \n", ganhoPorHora, horasTrabalhadas,salarioBruto);
            System.out.printf("(-) IR (%.0f%%)\t\t\t\t\t\t\t\t: R$ %.2f \n", descontoIR * 100, descontoIR * salarioBruto);
            System.out.printf("(-) INSS (%.0f%%)\t\t\t\t\t\t\t: R$ %.2f \n", descontoINSS * 100, descontoINSS * salarioBruto);
            System.out.printf("FGTS (%.0f%%)\t\t\t\t\t\t\t\t: R$ %.2f \n", valorFGTS * 100, valorFGTS * salarioBruto);
            System.out.printf("Total de descontos\t\t\t\t\t\t: R$ %.2f \n", totalDeDescontos);
            System.out.printf("Salário Liquido\t\t\t\t\t\t\t: R$ %.2f \n", salarioLiquido);
        }
        else{
            System.out.println("Digite um valor acima de zero!");
        }
    }
}