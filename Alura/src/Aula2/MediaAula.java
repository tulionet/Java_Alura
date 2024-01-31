package Aula2;

public class MediaAula {
    public static void main(String[] args){
        double nota1 = 7.5;
        double nota2 = 5.0;
        double resultado = (nota1 + nota2) / 2;
        System.out.println(resultado);

        int notaum = (int) nota1;
        System.out.println(notaum);

        char palavra1 = ',';
        String palavra2 = String.format("Oi%c me chamo Tulio", palavra1);
        System.out.println(palavra2);

        double precoProduto = 19.99;
        int quantidade = 3;
        System.out.println(precoProduto * quantidade);

        double valorEmDolares = 5;
        System.out.println(valorEmDolares * 4.94);
        System.out.println(String.format("O valor em dólares é: %.2f", valorEmDolares * 4.94));

        double precoOriginal = 59999;
        double percentualDesconto = 10;
        double resultadoPreco = precoOriginal - (percentualDesconto * precoOriginal) / 100;
        System.out.println(resultadoPreco);

    }
}