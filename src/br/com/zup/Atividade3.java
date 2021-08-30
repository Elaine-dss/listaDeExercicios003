package br.com.zup;

import java.util.Scanner;

public class Atividade3 {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá, sou agente do FBI");
        System.out.println("Vamos te fazer algumas perguntas.");
        System.out.println("Responda S para sim ou N para não");

        int respostasPositivas = 0;

        System.out.println("Telefonou para a vítima?");
        String resposta = leitor.nextLine();
        if (resposta.equals("S")){
            respostasPositivas += 1;
        }

        System.out.println("Esteve no local do crime?");
        resposta = leitor.nextLine();
        if (resposta.equals("S")){
            respostasPositivas += 1;
        }

        System.out.println("Mora perto da vítima?");
        resposta = leitor.nextLine();
        if (resposta.equals("S")){
            respostasPositivas += 1;
        }

        System.out.println("Devia para a vítima?");
        resposta = leitor.nextLine();
        if (resposta.equals("S")){
            respostasPositivas += 1;
        }

        System.out.println("Já trabalhou com a vítima?");
        resposta = leitor.nextLine();
        if (resposta.equals("S")){
            respostasPositivas += 1;
        }

        switch (respostasPositivas) {

            case 2:
                System.out.println("Você é um Suspeito do crime!");
                break;

            case 3: case 4:
                System.out.println("Você é cúmplice do crime!");
                break;

            case 5:
                System.out.println("Você é o assassino! Você está preso!");
                break;

            default:
                System.out.println("Você é inocente, me perdoe o incômodo!");
                break;
        }
    }
}
