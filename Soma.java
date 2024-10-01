import java.util.Scanner;

public class Soma {
    public static void main (String[] args) {
            int a, b;
            int c;

            int ResultadoAB;

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
