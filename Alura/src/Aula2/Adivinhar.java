package Aula2;

import java.util.Random;
import java.util.Scanner;

public class Adivinhar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String mensagem = """
                \nBem vindo ao jogo de adivinhação!
                O jogo consiste em você adivinhar 
                qual número aleatório de 0 à 100 estou imaginando;
                Você possui cinco chances para acertar.
                
                Digite 1 para iniciarmos.""";

        System.out.println(mensagem);
        int iniciar = scan.nextInt();

        if (iniciar != 1) {
            System.exit(0);
        }

        System.out.println("Vamos iniciar então:\nDigite um número de 0 à 100.");
        int valor = new Random().nextInt(100);
        int resposta = 0;
        int chances = 0;
        while (resposta != valor) {
            resposta = scan.nextInt();
            if (resposta == valor) {
                break;
            }
            if (resposta > valor) {
                System.out.println("O número que imaginei é menor do que este.");

            } else {
                System.out.println("O número que imaginei é maior do que este.");
            }
            chances++;

            if (chances == 5) {
                break;
            }
        }
        scan.close();
        if (resposta == valor) {
            System.out.println("\nParabéns você conseguiu acertar o número que imaginei.");
        } else {
            System.out.println("\nQue pena, parece que você não conseguiu acertar o número que imaginei: " + valor);
        }
    }
}


