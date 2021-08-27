package br.com.zup;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 5: ");
        int resposta = leitor.nextInt();

        switch (resposta){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3: case 4: case 5:
                System.out.println("3, 4 e 5");
                break;
        }
    }
}
