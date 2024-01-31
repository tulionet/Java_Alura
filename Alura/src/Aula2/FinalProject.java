package Aula2;

import java.util.Scanner;

public class FinalProject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // verifica se um número é positivo ou negativo
        System.out.println("Digite um número");
        int num = scan.nextInt();
        if (num > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

        // compara dois números
        System.out.println("\nDigite um número");
        int valor1 = scan.nextInt();
        System.out.println("Digite outro número");
        int valor2 = scan.nextInt();
        if (valor1 == valor2){
            System.out.println("Os números são iguais");
        } else {
            System.out.println("Os números não são iguais");
            if (valor1 > valor2){
                System.out.println("O primeiro valor é maior do que o segundo valor");
            } else {
                System.out.println("O segundo valor é maior do que o primeiro valor");
            }
        }

        // calcula a área de formas geométricas
        int escolha = 0;
        while (escolha != 3) {
            String mensagem = """
                    \nCalculadora de área de formas geométricas:
                    1 - Calcular área do quadrado.
                    2 - Calcular área do círculo.
                    3 - Sair.""";
            System.out.println(mensagem);
            escolha = scan.nextInt();
            if (escolha == 1) {
                System.out.println("Qual a altura do quadrado?");
                double altura = scan.nextDouble();
                System.out.println("Qual a base do quadrado?");
                double base = scan.nextDouble();
                double quadrado = altura * base; // calcula a área do quadrado
                System.out.println("A área do quadrado é: " + quadrado);
            }
            if (escolha == 2) {
                System.out.println("Qual é o raio do círculo?");
                double raio = scan.nextDouble();
                double circulo = (raio * raio) * 3.14; // calcula a área do círculo
                System.out.println("A área do círculo é: " + circulo);
            }
        }

        // calcula a tabuada de um número
        int escolha2 = 1;
        while (escolha2 != 0) {
            String mensagem = """
                   \nCalculadora de tabuada:
                   Digite um número de 1 à 10.
                   Ou digite 0 para sair.""";
            System.out.println(mensagem);
            escolha2 = scan.nextInt();
            for (int i = 1; i < 11; i++) {
                if (escolha2 == 0) {
                    break;
                }
                int tabuada = escolha2 * i; // calcula a tabuada
                System.out.println("O valor de " + escolha2 + " X " + i + " é igual a: " + tabuada);
            }
        }

        // verifica se um número é par ou ímpar
        System.out.println("\nDigite um número inteiro");
        int parOuImpar = scan.nextInt();
        if (parOuImpar % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        // calcula o fatorial de um número
        System.out.println("\nDigite um número inteiro");
        int fatorial = scan.nextInt();
        int fatorialtxt = fatorial;
        int resultado = fatorial;
        for (int i = 1; i < fatorialtxt; i++) {
            resultado = resultado * (fatorial - 1); // calcula o fatorial
            fatorial--;
        }
        System.out.println("O resultado do fatorial de " + fatorialtxt + " é igual à: " + resultado);
    }
}
