package Aula2;

public class Converttemp {
    public static void main(String[] args){
        int Celsius = 16;
        double Fahrenheit = (Celsius * 1.8) + 32;
        int valor = (int) Fahrenheit;

        String Mensagem = """
        A temperatura em graus Celsius estava em: %d Graus
        A temperatura em graus Fahrenheit estava em: %.2f Graus
        A temperatura em graus fahrenheit sem valores decimais estava em: %d Graus
        """.formatted(Celsius, Fahrenheit, valor);
        System.out.println(Mensagem);



    }

}
