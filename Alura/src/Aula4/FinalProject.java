package Aula4;

import java.util.Scanner;

public class FinalProject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operacao = 0;
        float saldo = 5000; // saldo inicial do usuário

        // loop principal do programa
        while (operacao != 4) {
            String mensagem = """
                    \n1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    Digite a opção desejada:""";
            System.out.println(mensagem);
            operacao = scan.nextInt();
            // executa a operação escolhida pelo usuário
            switch (operacao) {
                case 1: // consultar saldo
                    System.out.printf("\nSeu saldo é: %.2fR$", saldo);
                    break;
                case 2: // receber valor
                    System.out.println("Quanto você irá receber?");
                    float recebe = scan.nextFloat();
                    float saldox = saldo;
                    saldo = saldo + recebe; // atualiza o saldo
                    System.out.printf("\nSeu saldo de: %.2f ficou agora: %.2fR$" , saldox, saldo);
                    break;
                case 3: // transferir valor
                    System.out.println("Quanto você irá transferir?");
                    float transfere = scan.nextFloat();
                    saldox = saldo;
                    if (transfere > saldo) { // verifica se o usuário tem saldo suficiente
                        float diferenca = transfere - saldo;
                        System.out.printf("\nDesculpe, parece que você não possui saldo o suficiente, faltaram: %.2fR$", diferenca);
                    } else {
                        saldo = saldo - transfere; // atualiza o saldo
                        System.out.printf("\nSeu saldo de: %.2f ficou agora: %.2fR$", saldox, saldo);
                    }
                    break;
                default: // opção inválida
                    System.out.println("Operação inválida, selecione um valor válido.");
                    break;
            }
        }
    }
}
