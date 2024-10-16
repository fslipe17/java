import java.util.Scanner;

public class Soma {
    /**
     *Essa Função é responsavel por Calcular a soma de A + B e se A resposta for menor que C printar no console que o resultado é menor que C.
     * Primeiro numero inteiro.
     * Segundo numero inteiro.
     * Numero de comparação com o resultado de A + B
     * @return Essa função retorna se o resultado de A + B é maior ou menor que C.
     *
     */
    public static void main (String[] args) {
            int a, b;
            int c;

            Scanner sc = new Scanner(System.in);

            System.out.println("Digite um numero a ser Calculado");

            a = sc.nextInt();

            System.out.println("Digite outro numero a ser Calculado");

            b = sc.nextInt();

            System.out.println("Digite um numero de Comparacao");

            c = sc.nextInt();

            if (a + b < c) {
                System.out.println("Soma do Primeiro numero e do Segundo numero e menor que " + c);
            } else {
                System.out.println("Soma do Primeiro numero e do Segundo numero e maior que " + c);
            }

            sc.close();
    }
}
