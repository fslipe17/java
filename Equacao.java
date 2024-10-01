import java.util.Scanner;
public class Equacao {
    public static void Main (String[] args){
        int a, b, c;

//        int quadrado = a * a;
    }
    public class EquacaoSegundoGrau {

        // Método para calcular a raiz quadrada
        public static double raizQuadrada(double num) {
            if (num < 0) {
                return -1; // Indica que o número é negativo
            }
            double x = num;
            double y = 1;
            double e = 0.000001; // Precisão

            // Método de aproximação de Newton
            while (x - y > e) {
                x = (x + y) / 2; // Média
                y = num / x; // Aproximação
            }
            return x;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe o valor de A: ");
            double a = scanner.nextDouble();

            // Verificação se A é igual a zero
            if (a == 0) {
                System.out.println("A equação não é do segundo grau (A não pode ser zero).");
                return; // Encerra o programa
            }

            System.out.print("Informe o valor de B: ");
            double b = scanner.nextDouble();

            System.out.print("Informe o valor de C: ");
            double c = scanner.nextDouble();

            // Cálculo do delta
            double delta = b * b - 4 * a * c;

            // Verificação do valor de delta
            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else if (delta == 0) {
                double raiz = -b / (2 * a);
                System.out.println("A equação possui apenas uma raiz real: " + raiz);
            } else {
                double raizDelta = raizQuadrada(delta);
                double raiz1 = (-b + raizDelta) / (2 * a);
                double raiz2 = (-b - raizDelta) / (2 * a);
                System.out.println("A equação possui duas raízes reais: " + raiz1 + " e " + raiz2);
            }

            scanner.close(); // Fecha o scanner
        }
    }
}
